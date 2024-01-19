package com.nestor.calculos;

import java.util.Scanner;

public class Calculadora01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        double firstNumber = teclado.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        double secondNumber = teclado.nextDouble();

        System.out.println("Ingrese la operacion:");
        String operation = teclado.next();

//        System.out.println("El primer numero recibido es: " +firstNumber);
//        System.out.println("El segundo numero recibido es: " +secondNumber);
//        System.out.println("La operacion es: " +operation);

//        double resultado = doCalculation(firstNumber, secondNumber, operation.toLowerCase());
          //es por si antes de signo utilizamos cadena puede ser en minus o mayusc
        double resultado = doCalculation(firstNumber, secondNumber, operation);

        System.out.println("El resultado de la operacion " + operation +" es: " +resultado);
    }
    private static double doCalculation(double firstNumber, double secondNumber, String operation){
//        if (operation.equals("+")) {
//            return sum(firstNumber,secondNumber);
//        } else if (operation.equals("-")) {
//            return minus(firstNumber,secondNumber);
//        } else if (operation.equals("*")) {
//            return multiply (firstNumber, secondNumber);
//
//        } else if (operation.equals("/")) {
//            return div(firstNumber, secondNumber);
//        } else
//        System.out.println("Operacion desconocida");
//        return 0;
//        throw new IllegalArgumentException("operacion no conocida");

        switch (operation) {
            case "+" -> {
                return sum(firstNumber, secondNumber);
            }
            case "-" -> {
                return minus(firstNumber, secondNumber);
            }
            case "*" -> {
                return multiply(firstNumber, secondNumber);
            }
            case "/" -> {
                return div(firstNumber, secondNumber);
            }
            default -> {
        throw new IllegalArgumentException("Operacion no conocida");
              }
        }

    }

    private static double sum (double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }
    private static double minus (double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }
    private static double multiply (double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
    private static double div (double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

}
