package com.nestor.calculos;

import java.util.Scanner;

/*
de tres numeros calcular su promedio
con arrays
 */
public class PromedioCalculo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

//        teclado.nextDouble();
//        teclado.nextDouble();
//        teclado.nextDouble();

        double[] numbers = new double[3];

        for(int i=0; i< numbers.length ; i++){
            //for(int i=0; i<3 ; i++){    //no coloco el 3 asi si se cambia el tamaño del array no toco el codigo
            System.out.println("Introduce el numero " + (i + 1));
            double number = teclado.nextDouble();
            numbers[i] = number;
//            numbers[i] = teclado.nextDouble();
              // forma mas sencilla de escribir las dos lineas anteriores
        }

//        double result = calculateAverage(numbers);
//        System.out.println("El resultado del promedio de los n° infresado es: " +result);

        System.out.println("El resultado del promedio de los n° ingresado es: " + calculateAverage(numbers));

    }

//    private static void calculateAverage(double[] numbers) {
//    }

//    private static double calculateAverage(double[] numbers) {
//        double sum = 0;
////        for (int i=0; i<numbers.length; i++) {
////            sum = sum + numbers[i];
////        }
//        for (double number : numbers) {   //reemplazo el for anterior por este mas simple
//            sum = sum + number;
//        }
//        return sum / numbers.length;
//    }
        private static double calculateAverage(double[] numbers) {
            return sumNumbers(numbers) / numbers.length;
        }
        private static double sumNumbers(double[] numbers) {
            double sum = 0;
            for (double number : numbers) {
                sum = sum + number;
            }
            return sum;
        }
}
