/**
 * Evaluamos un numero metido por el usario para saber si es un numero afortunado o no, 
 * Mediante el uso de while e if, realiza la evaluacion del modulo de dicho numero con respecto a 10
 * y compara el resultado con parametros predefinidos.
 */

import java.util.Scanner;
public class Codigo5 {
    //Inclusion del metodo main
    public static void main(String[] args) {
        //Adicion de donde lee las cosas el objeto scanner s
        Scanner s = new Scanner(System.in);
        //Cambio de comilla simple a comilla doble
	    System.out.print("Introduzca un número: ");
	    String ni = s.nextLine();
        //Conversion de tipos de objeto, de String a int
	    int c = Integer.parseInt(ni);
        //ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    //Cambio de variable a comparar, en vez de ni a c
	    while (c > 0) {
            //Se quito el "cast"
		  int digito = c % 10;
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
			}
		
        //Cambio de prinln a println
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
		//Cambio del scope de la operacion debido a que solamente se realizaba dentro del else, cuando el caso sera verdero, 
		// se cicla infinitament el programa
		c /= 10;
	  }
      //Ciere del scanner
      s.close();
    }	  
}