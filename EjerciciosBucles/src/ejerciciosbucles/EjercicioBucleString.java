package ejerciciosbucles;

import java.util.Scanner;

public class EjercicioBucleString {

    public static void main(String[] args) {
       String palabra="NULL";
       Scanner teclado = new Scanner(System.in);
       while(!palabra.equalsIgnoreCase("salir")){
       System.out.println("Ingrese una palabra random por teclado: ");
       palabra = teclado.next();
           System.out.println("Palabra ingresada: "+ palabra);
           System.out.println("--------------------------------------");
       }
        System.out.println("*****************Saliste del bucle***************");
       
    }   
}
