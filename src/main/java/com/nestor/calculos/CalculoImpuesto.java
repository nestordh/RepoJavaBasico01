package com.nestor.calculos;

import java.util.Scanner;

public class CalculoImpuesto {
    public static void main(String[] args) {

        System.out.println("Ingrese el tipo de producto a calcular impuesto:");

        Scanner teclado = new Scanner(System.in);
        System.out.println("1) Alimento");
        System.out.println("2) BebidaSinAlcohol");
        System.out.println("3) BebidaConAlchohol");
        System.out.println("4) Vestimenta");
        System.out.println("5) Cosmeticos");

        String tipoProducto = teclado.nextLine();

        switch (tipoProducto){
            case "1":
                System.out.println("El impuesto es del 10.5%");
                break;
            case "2":
                System.out.println("El impuesto es del 21%");
                break;
            case "3":
                System.out.println("El impuesto es del 25%");
                break;
            case "4":
                System.out.println("El impuesto es del 15%");
                break;
            case "5":
                System.out.println("El impuesto es del 30%");
                break;
            default:
                System.out.println("Ingrese tipo de producto correcto");
        }


    }
}
