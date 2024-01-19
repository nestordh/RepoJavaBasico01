package com.nestor.calculos;

import java.util.Scanner;

public class Regla50_30_20 {
    public static void main(String[] args) {
        //100: sueldo
        // 50: Nesecidades
        // 30: cosas que queremos
        // 20: Ahorros

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu ingreso Mensual: $ ");

        //float salario = Float.parseFloat(teclado.nextLine());
        float salario = teclado.nextFloat();
        //float salario = 950000f;


        float necesidades = salario *0.5f;
        float otrasCosas = salario * 0.2f;
        float ahorros = salario * 0.3f;
        System.out.println("Deberias asignar tus ingresos de la sig forma: ");
        System.out.println("En tus Necesidades: $" + necesidades);
        System.out.println("En tus gustos y otras cosas: $" + otrasCosas);
        System.out.println("En tus ahorros: $" + ahorros);

    }
}
