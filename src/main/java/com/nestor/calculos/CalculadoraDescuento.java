package com.nestor.calculos;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese Precio del descuento a aplicar el descuento: $");
        double precioTotal = teclado.nextDouble();

        System.out.print("Descuento a aplicar: % ");
        double descuento = teclado.nextDouble();

        double montoDescuento = precioTotal * descuento/100;
        double precioConDescuento = precioTotal - montoDescuento;

        System.out.println("El descuento es de: $" + montoDescuento);
        System.out.println("El precio del producto con el descuento es de: $" +precioConDescuento);
    }
}
