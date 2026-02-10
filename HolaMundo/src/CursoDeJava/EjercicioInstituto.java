package CursoDeJava;

import java.util.Scanner;

public class EjercicioInstituto {

    public static void main(String[] args) {
    int edad;
    Scanner teclado = new Scanner(System.in);
        System.out.println("-----Welcome to University-----");
        System.out.println("Ingrese edad del alumno (4 a 13): ");
        edad = teclado.nextInt();
        
        if(edad >= 4 && edad <=6){
            System.out.println("Clases los lunes y miercoles de 16 a 17 hs");
        }
        else{
            if(edad >= 7 && edad <= 8){
                System.out.println("Clases los Martes y Jueves de 16:30 a 17:30 hs");
            }
            else{
                if(edad >= 9 && edad <=10){
                    System.out.println("Clases Martes y Jueves de 17:30 a 19 hs");
                }
                else{
                    if(edad >= 11 && edad <= 13){
                        System.out.println("Clases Lunes y Miercoles de 17 a 18:30 hs");
                    }
                    else{
                        System.out.println("Ingrese una edad valida");
                    }
                }
            }
        }
    
    }
    
}
