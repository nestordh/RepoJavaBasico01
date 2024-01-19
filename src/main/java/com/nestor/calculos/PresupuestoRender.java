package com.nestor.calculos;
/*
ingresar una cantidad de minutos , pasar costo de los minutos a renderizar
 */
import java.util.Scanner;

public class PresupuestoRender {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a grabar para presupuestar:");

        double cantMinutos = teclado.nextDouble();
        double precioPorMinuto = 0.05f;
        //double cantMinutos = 2325602;
        double precioFinal = precioPorMinuto * cantMinutos;

        System.out.println(" Precio final: $" + precioFinal);
    }
}