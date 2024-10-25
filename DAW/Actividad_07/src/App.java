
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Juego | Piedra, Papel, Tigera");
        System.out.println("Como se juega? \nSe tiene que elegir uno de lot tres objetos. \nDespues de elegir el la computadora random tambien elige uno de los tres objetos. \nPiedra gana tigera, tijera gana papel y papel gana peidra.");

        int option;

        do { 

            System.out.println("1. Empezar juego");
            System.out.println("2. Salir");
            option = sc.nextInt();

            switch (option) {
                case 1:
                        


                    break;

                case 2:
                        
                

                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);













    }
}
