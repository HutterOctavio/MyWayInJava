package CursoDeJava;

import java.util.Scanner;

public class OperadoresTernarios {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota=0;
        float promedio;
        char AprobadoODesaprobado;
        System.out.println("Ingrese primera nota del alumno: ");
        nota+=teclado.nextInt();
        System.out.println("ingrese la segunda nota del alumno: ");
        nota+=teclado.nextInt();
        System.out.println("ingrese la tercera nota del alumno: ");
        nota+=teclado.nextInt();
        
        promedio=nota/3;
        if (promedio<6){
            System.out.println("El alumno esta desaprobado");
        }
        else{
            if(promedio>=6){
                System.out.println("El alumno esta aprobado Felicitaciones :D");
            }
        }            
    }
  }    

