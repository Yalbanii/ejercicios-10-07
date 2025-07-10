package com.generation;
import java.util.Scanner; //importar scanner
public class Codigo4 {
 //falta Main
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in); //para recibir valores System.in

            System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            String j1 = s.nextLine().toLowerCase;

            System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            //Scanner s2 = new Scanner(System.in); no se necesitan 2 scanner

            String j2 = s.nextLine().toLowerCase; //se llama la segunda variable correctamente

            if (j1==j2) { //sobra un )
                System.out.println("Empate");
            } else {
                int g = 2;
                switch(j1) { //.toLowerCase() para cambiar todo a minusculas y poder usar equals
                    case "piedra":
                        if (j2.equals("tijeras")){ //equals compara strings
                            g = 1;
                        }
                        break; //faltaba

                    case "papel":
                        if (j2.equals("piedra")) {
                            g = 1;
                        } //faltaba cerrar {} del caso papel
                        break;
                    case "tijeras": //falta s
                        if (j2.equals("papel")){
                            g = 1;
                        }
                        break;
                    //default: g=2; // gana el jugador 2, se puede omitir
                }
            System.out.println("Gana el jugador " + g);    
            } //scanner.close(); //cerrar scanner opcional
           

        }

    }
