package otrosEjemplos;

import java.util.Scanner;
/*
imc  > 30 obeso
imc  25 - 30 sobrepeso
imc  18.5 - 25 normal
imc  < 18.5 debajo del normal
 */
public class masaCorporal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg:");
        double peso = teclado.nextDouble();


        System.out.println("Ingrese su altura (en Metro con,)");
        double altura = teclado.nextDouble();

        double imc = ( peso / (altura * altura));

       System.out.println("Tu indice de masa corporal es: " + imc);

        if (imc > 30) {
            System.out.println("CUIDADO!!! Tu indice de masa corporal es de obeso (IMC=" +imc+")");
        } else if (imc >=25 && imc <=30){
            System.out.println("Mmm Tu indice de masa corpóral es de sobrepeso (IMC=" +imc+ ")");
        } else if (imc >=18.5 && imc<25) {
            System.out.println("Genial!! Tu indice de masa corporal es Normal (IMC=" +imc+")");
        } else if (imc <18.5) {
            System.out.println("Cuidado tu indice de masa corpora dice que estas debajo del valor (IMC=" +imc+")");
        }else {
            System.out.println("ingrese datos correctos");
        }


    }

}
