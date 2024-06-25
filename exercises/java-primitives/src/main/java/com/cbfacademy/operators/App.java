package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
    return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return operand1 > operand2;
    }

    //Array homework

    public static void intArray(){
        int[] numeros = new int[] {49, 8, 5, 55, 65, 4, 23, 1};
        System.out.println("Fifth number available: " + numeros[4]);

        float[] floats = new float[] {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.10f, 11.11f, 12.12f};
        System.out.println("Fifth float number available: " + floats[4]);

        double[] doubles = new double[] {10.5, 66.8, 63.4, 33.8, 80.0};
        System.out.println("Fifth double number available: " + doubles[4]);

        boolean[] booleans = new boolean[] {true, false, false, false, true, false};
        System.out.println("Fifth boolean result available: " + booleans[4]);

        Object[][] matrix = {
            {numeros},
            {floats},
            {doubles},
            {booleans}
        };
    }


}
