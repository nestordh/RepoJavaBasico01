package com.nestor.calculos;

import java.util.Scanner;

public class conversorKmMilla {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la opcion para convertir: ");
        System.out.println("1 Pasar de Km a Millas");
        System.out.println("2 Pasar de Millas a km");
        System.out.println("3 Pasar de Km a Milla Nautica");
        System.out.println("4 Pasar de Milla Nautica a km");
        System.out.println("5 Pasar de centimetro a Pulgada");
        System.out.println("6 Pasar de Pulgada a Centimetro");
        byte opcion = teclado.nextByte();

        System.out.print("Ingrese el valor de la  medida a pasar:");
        double valor = teclado.nextDouble();


        double kmMilla = 0;                ;
        double reskmMilla = 0;
        double resMillaKm = 0;

        if (opcion == 1){
            reskmMilla = valor / 1.60934;
            System.out.println("La convercion de los "+valor+"km a millas es de: " + reskmMilla + " millas");
        } else if (opcion == 2) {
            resMillaKm = valor * 1.64934;
            System.out.println("La convercion  de los "+valor+"millas a km es de: " + resMillaKm +" km");
                    }

    }
}
