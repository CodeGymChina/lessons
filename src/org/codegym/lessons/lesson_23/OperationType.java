package org.codegym.lessons.lesson_23;

/**
 * 操作枚举
 */
public enum OperationType {

    ADD("增加"),
    DELETE("删除"),
    UPDATE("修改"),
    QUERY("查询");

    private String oper;

    OperationType(String oper) {
        this.oper = oper;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }
}
