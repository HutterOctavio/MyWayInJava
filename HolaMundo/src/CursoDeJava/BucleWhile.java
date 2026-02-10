package CursoDeJava;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {
      int contador=0;
      boolean bandera= true;
      String rta;
      Scanner teclado = new Scanner(System.in);
      //Bucle while controlado por UN CONTADOR
      /*
      while(contador < 10){
          System.out.println("Estoy en la vuelta numero: " +  (contador+1));
          contador++;
      }*/
      
      while(bandera == true){
          System.out.println("El valor de mi bandera es: " + bandera);
          System.out.println("¿Esta actualmente estudiando JAVA?" + bandera);
          
          System.out.println("¿Queres dejar de estudiar?");
          rta = teclado.next();
          
          if(rta.equalsIgnoreCase("si")){
              bandera= false;
          }
          
          System.out.println("--------------------------------------------");
      }
    }
    
}
