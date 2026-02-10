package ejerciciosbucles;

import java.util.Scanner;

public class EjercicioWhile {

   
    public static void main(String[] args) {
      int limite,count=0;   
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese un  numero: ");
      limite = teclado.nextInt();
      while(count < limite){
          System.out.println(count+1);
          count++;
      }
    }
}
