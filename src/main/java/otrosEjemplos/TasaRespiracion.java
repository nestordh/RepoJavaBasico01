package otrosEjemplos;

import java.util.Scanner;

public class TasaRespiracion {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de respiraciones por minuto (RPM)");

        Scanner teclado = new Scanner(System.in);
        int respiraciones = teclado.nextInt();

        if  (respiraciones >= 12 && respiraciones <= 20) {
            System.out.println("La tasa de respiracion esta en el rango normal");
        } else if(respiraciones < 12 && respiraciones>0) {
            System.out.println("La tasa de respiracion esta en el rango bajo");
        } else if (respiraciones > 20 && respiraciones<80) {
            System.out.println("La tasa de respiracion esta en el rango alta");
        } else {
            System.out.println("Ingrese un numero de respiracion correcto");
        }

    }
}
