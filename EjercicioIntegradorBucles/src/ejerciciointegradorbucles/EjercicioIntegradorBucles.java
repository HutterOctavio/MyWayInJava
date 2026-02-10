package ejerciciointegradorbucles;

import java.util.Scanner;

public class EjercicioIntegradorBucles {

  
    public static void main(String[] args) {
        Scanner cadenas = new Scanner(System.in);
        Scanner enteros = new Scanner(System.in);
        String matricula;
        int tipo,horas,count1=0,count2=0,count3=0;
        double total,acumulador=0;
        System.out.println("Ingrese la matricula de su Vehiculo o 'Salir': ");
        matricula = cadenas.nextLine();
        
        while(!matricula.equalsIgnoreCase("salir")){
            System.out.println("******Que tipo de servicio le interesa******\n1-Por hora\n2-Media jornada (5 horas)\n3-Jornada completa (Hasta 10 horas)");
            tipo = enteros.nextInt();
            
            if(tipo==1){
                System.out.println("----------------------------------------------");
                System.out.println("ingrese las horas de estacionamiento: ");
                horas=enteros.nextInt();
                total= horas * 3;
                System.out.println("El monto total es de: $" + total + " USD");
                count1++;
                acumulador+= total;
                System.out.println("----------------------------------------------");
            }
            else{
                if(tipo==2){
                    System.out.println("----------------------------------------------");
                    System.out.println("La media jornada es de 15 dolares y posees un descuento del 5%");
                    total = 15-(15*0.05);
                    System.out.println("El monto total es de: $" + total + " USD");
                    count2++;
                    acumulador+=total;
                    System.out.println("----------------------------------------------");
                }
                else{
                    if(tipo==3){
                        System.out.println("----------------------------------------------");
                        System.out.println("La jornada completa es de 30 dolares y posees un descuento del 10%");
                        total = 30-(30*0.10);
                        System.out.println("El monto total es de: $" + total + " USD");
                        count3++;
                        acumulador+=total;
                        System.out.println("----------------------------------------------");
                    }
                    else{
                        System.out.println("Elija una opcion valida...");
                    }
                }
            }
            
        /*SE REPITE LA PREGUNTA*/  
        System.out.println("Ingrese la matricula de su Vehiculo o 'Salir': ");
        matricula = cadenas.nextLine();
        }
        System.out.println("************************************RESUMEN TOTAL DEL DIA************************************");
        System.out.println("Cantidad por hora: " + count1 + "\nCantidad de media jornada: " + count2 + "\nCantidad de jornada completa: " + count3);
        System.out.println("Dinero total del dia: $" + acumulador + " USD");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
  
    }
    
}
