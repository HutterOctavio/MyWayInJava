package CursoDeJava;

import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {
        int edad;
        System.out.println("Ingrese tu edad: ");
        Scanner anios = new Scanner(System.in);

        edad = anios.nextInt();

        if (edad > 18) {
            System.out.println("Acceso permitido");
        } else {
            if (edad == 18) {
                System.out.println("Tenes exactamente 18, acceso permitido");
            } else {
                System.out.println("acceso denegado");
            }
        }
    }

}
