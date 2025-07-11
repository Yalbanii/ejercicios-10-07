/**
 * El programa genera 20 numeros con Math.random (del rango de 1 al 381) y los guarda en array de tamaño 20,
 * Imprime dichos numeros, y pide al usuario que elija que numeros resaltar, si los multiplos
 * de 5 o de 7, realiza la evaluacion del cada uno de los numeros mediante el uso del modulo seleccionado
 * por el usuario, y finalmente vuelve a imprimir el arreglo pero señalando con corchetes los multiplos del
 * multiplo anteriormente seleccionado
 */
public class Codigo6 {
	  public static void main(String[] args) {
       //Falta de operador new
        int[] n = new int[20];
        //Correccion de la iteración
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      //faltaba out
          System.out.print(n[i] + " ");
	    }
	    //Cambio de printl a printf debido que cuenta con secuencia de escape
	    System.out.printf("\n¿Qué números quiere resaltar? ");
	    //Cambio de los simbolos unicode de guiones, por guiones normales 
        System.out.print("(1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
	    //falta parentesis
        int opcion = Integer.parseInt(System.console().readLine());
        //Arreglo del escope para la evaluación en una linea
	    int multiplo = ((opcion == 1) ? 5 : 7);
        //Correccion es un foreach pero la sintaxis es diferente
	    for(int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
            //Completado de if en sus llaves
          }else {
            //Cambio del metodo de System de in a out
	        System.out.print(e + " ");
	      }
	    
      }	  
    }
}