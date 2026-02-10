package CursoDeJava;

import java.util.Scanner;

public class EjercicioDoWhile {

    public static void main(String[] args) {
     int contador=0;
     
     do {
         System.out.println("Estoy en la vuelta numero " +  (contador+1)); 
         contador++;
     }while(contador <10);
    }
    
}
