package org.example;

public class Calculator {

    public enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public double calculate(double a, double b, Operator op) {
        if (op == Operator.ADD) {
            return a + b;
        } else if (op == Operator.SUBTRACT) {
            return a - b;
        } else if (op == Operator.MULTIPLY) {
            return a * b;
        } else if (op == Operator.DIVIDE) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        } else {
            throw new IllegalArgumentException("Unknown operator");
        }
    }
}
