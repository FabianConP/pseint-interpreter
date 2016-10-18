package model.logic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import model.generated.pseintGrammarBaseVisitor;
import model.generated.pseintGrammarParser;

public class ProceduresVisitor<T> extends pseintGrammarBaseVisitor<T> {

    private HashMap<String, Procedure> procedures;

    public ProceduresVisitor() {
        procedures = new HashMap<>();
    }

    @Override
    public T visitPrincipal(pseintGrammarParser.PrincipalContext ctx
    ) {
        if (ctx.ID() != null) {
            String nameProc = ctx.ID().getText().toLowerCase();
            String id = Procedure.buildId(nameProc, 0);
            if (procedures.containsKey(id))
                Util.semanticError(ctx.ID(), "ya existe un procedimiento con el mismo nombre y numero de paramatros");
            Procedure procedure = new Procedure(nameProc, new LinkedList<String>(), null, null);
            procedures.put(id, procedure);
        }
//        return super.visitProcedimiento(ctx);
        return null;
    }

    @Override
    public T visitProcedimiento(pseintGrammarParser.ProcedimientoContext ctx
    ) {
        if (ctx.ID().size() > 0) {
            String nameProc = ctx.ID(ctx.ID().size() - 1).getText().toLowerCase();
            int numParams = ctx.idLista() == null ? 0 : ctx.idLista().ID().size();
            String id = Procedure.buildId(nameProc, numParams);
            if (procedures.containsKey(id))
                Util.semanticError(ctx.ID(1), "ya existe un procedimiento con el mismo nombre y numero de paramatros");
            Variable returnVar = null;
            if (ctx.ID().size() > 1) {
                String idReturnVarName = ctx.ID(0).getText();
                returnVar = new Variable(idReturnVarName, "", false);
            }
            List<String> params = new LinkedList<>();
            if(ctx.idLista() != null && ctx.idLista().ID() != null)
                ctx.idLista().ID().stream().forEach(idParam -> params.add(idParam.getText()));
            Procedure procedure = new Procedure(nameProc, params, returnVar, ctx);
            procedures.put(id, procedure);
        }
//        return super.visitProcedimiento(ctx);
        return null;
    }

    public HashMap<String, Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(HashMap<String, Procedure> procedures) {
        this.procedures = procedures;
    }
}
