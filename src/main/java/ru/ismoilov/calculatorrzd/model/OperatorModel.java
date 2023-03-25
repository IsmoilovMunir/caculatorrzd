package ru.ismoilov.calculatorrzd.model;

import org.springframework.beans.factory.annotation.Autowired;

public class OperatorModel {

    private String expression;

    public OperatorModel() {
    }

    public OperatorModel(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
