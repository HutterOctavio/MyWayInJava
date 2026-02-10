package CursoDeJava;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        double num1,num2,rta;
        System.out.println("ingrese el primer numero a operar: ");
        Scanner teclado = new Scanner(System.in);
        num1=teclado.nextDouble();
        System.out.println("ingrese el segundo numero a operar: ");
        num2=teclado.nextDouble();
        rta=num1/num2;
        System.out.println("suma: " + rta);
        
   
    }
    
}
