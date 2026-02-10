package CursoDeJava;

import java.util.Scanner;

public class swich {

    public static void main(String[] args) {
        int  dia;
        String nombreDia;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("----Elija un dia de la semana----\n1-Lunes\n2-Martes\n3-Miercoles\n4-Jueves-\n5-Viernes\n6-Sabado\n7-Domingo\nRTA: ");
        dia = teclado.nextInt();
        
        switch(dia){
            case 1: nombreDia = "Lunes"; break;
            case 2: nombreDia = "Martes"; break;
            case 3: nombreDia = "Miercoles"; break;
            case 4: nombreDia = "Jueves"; break;
            case 5: nombreDia = "Viernes"; break;
            case 6: nombreDia = "Sabado";  break;
            case 7: nombreDia = "Domingo"; break;
            default: nombreDia= "Dia incorrecto";
        }
        
        System.out.println("\n\nElegiste: " + nombreDia);
    }
    
}
