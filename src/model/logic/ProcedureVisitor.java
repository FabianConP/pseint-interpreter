package model.logic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import model.generated.pseintGrammarBaseVisitor;
import model.generated.pseintGrammarParser;

public class ProcedureVisitor<T> extends pseintGrammarBaseVisitor<T> {

    private HashMap<String, Procedure> procedures;

    public ProcedureVisitor() {
        procedures = new HashMap<>();
    }

    @Override
    public T visitPrincipal(pseintGrammarParser.PrincipalContext ctx
    ) {
        if (ctx.ID() != null) {
            String nameProc = ctx.ID().getText().toLowerCase();
            String id = Procedure.buildId(nameProc, 0);
            if (procedures.containsKey(id))
            //? if (procedures.containsKey(nameProc))
                ErrorHandling.semanticError(ctx.ID(), "el simbolo con nombre \"" + nameProc + "\" ya ha sido declarado");
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
            int procIdPos = ctx.ID().size() - 1;
            String nameProc = ctx.ID(procIdPos).getText().toLowerCase();
            int numParams = ctx.idLista() == null ? 0 : ctx.idLista().ID().size();
            String id = Procedure.buildId(nameProc, numParams);
            if (procedures.containsKey(id))
            //? if (procedures.containsKey(nameProc))
                ErrorHandling.semanticError(ctx.ID(procIdPos), "el simbolo con nombre \"" + nameProc + "\" ya ha sido declarado");
            Variable returnVar = null;
            if (procIdPos > 0) {
                String idReturnVarName = ctx.ID(0).getText();
                returnVar = new Variable(idReturnVarName, "", false);
            }
            List<String> params = new LinkedList<>();
            if(ctx.idLista() != null && ctx.idLista().ID() != null)
                ctx.idLista().ID().stream().forEach(idParam -> params.add(idParam.getText()));
            Procedure procedure = new Procedure(nameProc, params, returnVar, ctx);
            procedures.put(id, procedure);
            //? procedures.put(nameProc, procedure);
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
