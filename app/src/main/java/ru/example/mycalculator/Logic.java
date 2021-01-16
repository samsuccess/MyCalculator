package ru.example.mycalculator;

class Logic {

    private double num1;
    private double num2;

    public Logic() {
        num1 = 0;
        num2 = 0;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double sum() {
        return num1 + num2;
    }

    public double sub() {
        return num1 - num2;
    }

    public double div() {
        return num1 / num2;
    }

    public double mul() {
        return num1 * num2;
    }

    public double procent() {
        return num1 / 100 * num2;
    }
}
