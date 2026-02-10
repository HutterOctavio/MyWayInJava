package CursoDeJava;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        
        String nombre;
        int edad;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println(" ingrese tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("ingrese su edad: ");
        edad = teclado.nextInt();
        
        System.out.println("Hola tu nombre es: " + nombre + " y tu edad es: " + edad );
               
    }
    
}
