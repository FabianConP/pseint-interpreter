package model.logic;

import java.util.List;
import model.generated.pseintGrammarParser;

public class Procedure {

    private String name;
    private List<String> paramNames;
    private Variable returnVar;
    private pseintGrammarParser.ProcedimientoContext context;

    public Procedure(String name, List<String> paramNames, Variable returnVar, pseintGrammarParser.ProcedimientoContext context) {
        this.name = name;
        this.paramNames = paramNames;
        this.returnVar = returnVar;
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParamNames() {
        return paramNames;
    }

    public void setParamNames(List<String> paramNames) {
        this.paramNames = paramNames;
    }

    public Variable getReturnVar() {
        return returnVar;
    }

    public void setReturnVar(Variable returnVar) {
        this.returnVar = returnVar;
    }

    public pseintGrammarParser.ProcedimientoContext getContext() {
        return context;
    }

    public void setContext(pseintGrammarParser.ProcedimientoContext context) {
        this.context = context;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        Procedure o = (Procedure) obj;
        return (buildId(this)).equals(buildId(o));
    }

    public static String buildId(Procedure p) {
        return p.name + "#" + p.paramNames.size();
    }

    public static String buildId(String name, int numParams) {
        return name + "#" + numParams;
    }

}
