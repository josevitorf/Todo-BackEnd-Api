package com.example.todo.enums;

public enum Priority {

    LOW(0, "LOW"),
    MEDIUM(1, "MEDIUM"),
    HIGH(5, "alto");

    private Integer code;
    private String description;


    Priority(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Priority toEnum(Integer code){
        if(code == null){
            return null;
        }
        for (Priority x : Priority.values()) {
            if(code.equals(x.getCode())){
                return x;
            }
        }
        throw new IllegalArgumentException("prioridade Invalida" + code);
    }
}
