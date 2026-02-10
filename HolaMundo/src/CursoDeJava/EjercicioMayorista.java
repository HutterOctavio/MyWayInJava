package CursoDeJava;

import java.util.Scanner;

public class EjercicioMayorista{

    public static void main(String[] args) {  
        int cant;
        double total, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("*****Bienvenid@ a  la Mercenaria*****");
        System.out.println("Ingrese la cantidad de productos a llevar: ");
        cant = teclado.nextInt();
        //  Reiniciar el Scanner para no mezclar  next int y next double en un mismo SCANNER
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto total de la compra: ");
        total = teclado.nextDouble();
        //***********Costos de envios*************
        if(cant < 5){
            System.out.println("No se permite compras inferiores a 5 productos :(");
        }
        else{
            if(cant >= 5 && cant <= 15){
                System.out.println("Excelente, El costo de envio es de un total de $10 USD");
            }
            else{
                if(cant > 15){
                    System.out.println("Perfecto, El envio es Gratuito :D");
                }
                else{System.out.println("Ingresa una cantidad valida");
                }
            }
        }
        //**********Promociones**************
        if(total < 100 && total > 0){
            total = 100-total;
            System.out.println("El monto actual no entra en una promocion, para entrar en una promocion faltan: " + total + " USD");
        }
        else{
            if(total >=100 && total <= 300){
                descuento = total*0.05;
                total = total-descuento;
                System.out.println("Usted obtuvo un descuento del 5%, Monto total con descuento: " + total + " USD");
            }
            else{
                if(total > 300){
                    descuento = total*0.10;
                    total = total-descuento;
                    System.out.println("Obtuviste un descuento del 10% por tu compra, monto total con descuento: "+ total+ " USD");
                }
                else{ if(total < 0){
                    System.out.println("No se permite montos negativos");
                }
                else{
                    System.out.println("**************INGRESE UN NUMERO VALIDO**************");
                    }
                }
            }
        }
    }
    
}
