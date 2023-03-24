package ru.ismoilov.calculatorrzd.model;

public class OperatorModel {
    private String operation;
    private int a;
    private int b;
    private int c;

    public OperatorModel() {
    }

    public OperatorModel(String operation) {
        this.operation = operation;
    }

    public OperatorModel(int c) {
        this.c = c;
    }

    public OperatorModel(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
