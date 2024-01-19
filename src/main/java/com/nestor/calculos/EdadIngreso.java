package com.nestor.calculos;

import java.util.Scanner;

public class EdadIngreso {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");

        try{
            int edad = teclado.nextInt();
            if(edad>=18 && edad < 110){
                System.out.println("Puedes ingresar al sitio, eres mayor de edad");
            }else if (edad>1 && edad < 18){
                System.out.println("eres menor de edad, no puedes ingresar");
            }
        }catch (Exception e) {
            System.out.println("Ingrese una edad valida en numero: " + e.getMessage() );

        }

    }
}
