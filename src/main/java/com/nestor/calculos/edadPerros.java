package com.nestor.calculos;

import java.util.Scanner;

public class edadPerros {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de años del Perro: ");

        int anioPerro = teclado.nextInt();
        int edadPerro = anioPerro * 7;

        System.out.println("La edad del perro es de: " + edadPerro);

}
}
