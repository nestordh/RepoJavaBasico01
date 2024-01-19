package otrosEjemplos;

import java.util.Scanner;

public class Quemaduras {
    public static void main(String[] args) {
        System.out.println("1° tienes que reconocer que tipo de quemadura es?");

        System.out.println(" - Primer grado");
        System.out.println("Sintomas: Enrojecimiento, Dolor leve y posible hinchazon, Afecta solo 1 capa de piel ");

        System.out.println(" - Segundo grado");
        System.out.println("Sintomas: Ampollas, enrojecimiento, dolor intenzo e hinchazon");

        System.out.println(" - Tercer grado");
        System.out.println("Sintomas: Piel carbonizada, area insensible y potencialmente grave hinchazon y daño tisular ");

        System.out.println("Ingrese el tipo de quemadura: ");
        System.out.println("1) Primer grado");
        System.out.println("2) Segundo grado");
        System.out.println("3) Tercer grado");

        Scanner teclado = new Scanner(System.in);
        int eleccion = teclado.nextInt();

        if (eleccion == 1) {
            System.out.println("Tratamiento: ...... para quemadura  1 grado");
        } else if (eleccion == 2) {
            System.out.println("Tratamiento: ...... para quemadura  2 grado");
        } else if (eleccion == 3) {
            System.out.println("Tratamiento: ......para quemaduras  3 grado");
        } else {
            System.out.println("Elija opcion correcta");
        }
    }
}
