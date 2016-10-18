package model.logic;

public class Variable {

    private String name;
    private String type;
    private boolean initialized;
    private Object value;

    public Variable(String name, String type, boolean initialized, Object value) {
        this.name = name;
        this.type = type;
        this.initialized = initialized;
        this.value = value;
    }

    public Variable(String name, String type, boolean initialized) {
        this.name = name;
        this.type = type;
        this.initialized = initialized;
        switch (type) {
            case "Integer":
                value = 0;
                break;
            case "Double":
                value = 0.0;
                break;
            case "Character":
                value = (char) 0;
                break;
            case "String":
                value = "";
                break;
            case "Boolean":
                value = false;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
