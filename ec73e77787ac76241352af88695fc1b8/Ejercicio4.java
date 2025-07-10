package com.generation;
import java.util.Scanner;
public class Codigo4 {
    public class Main { //falta Main
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            String j1 = s.nextLine();

            System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            //Scanner s2 = new Scanner();
            String j2 = s.nextLine();

            if (j1.equals(j2)) { //aniadir equals porque son strings
                System.out.println("Empate");
            } else {
                int g = 2;
                switch(j1) {
                    case "piedra":
                        if (j2.equals("tijeras")){
                            g = 1;
                        }

                    case "papel":
                        if (j2.equals ("piedra")) {
                            g = 1;
                        } //faltaba cerrar {} del caso papel
                    case "tijera":
                        if (j2.equals("papel")){
                            g = 1;
                        }
                        break;
                    default:
                }
                System.out.println("Gana el jugador " + g);
            }

        }

    }
}

    /*
    public class Codigo4 {
import java.util.Scanner;Scanner s = new Scanner();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    //Scanner s2 = new Scanner();
    String j2 = s.nextLine();
    
    if (j1 == j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
              default: ("Intenta otra vez")
      }
      System.out.println("Gana el jugador " + g);
    }
  
    }
}
*/