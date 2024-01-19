package com.nestor.calculos;

import java.util.Scanner;

public class Precio_IVA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio total a discrimar el I.V.A. $");

        float precio = scanner.nextFloat();

        float iva = 21;
//        float precio = 50;
        float totalADescontar = iva * precio / 100;
        float precioSIVA = precio - totalADescontar;
        System.out.println("Precio del producto sin I.V.A. es: $"+ precioSIVA );
    }
}
