
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Juego | Piedra, Papel, Tigera");

        System.out.println("Como se juega? \nSe tiene que elegir uno de lot tres objetos. \nDespues de elegir el la computadora random tambien elige uno de los tres objetos. \nPiedra gana tigera, tijera gana papel y papel gana peidra.");

        String[] Robot = {"Piedra", "Papel", "Tijera"};
        Random random = new Random();
        int randomIndex = random.nextInt(Robot.length);

        System.out.print("Su seleccion [P = Piedra, L = Papel, T = Tijera]: ");
        String opcionJugado = sc.nextLine();

        int optionRobot = randomIndex;
        int opcionJugador = 0;
        
        switch (optionRobot) {
            case 'P':

                switch (opcionJugador) {

                    case 'P': System.out.println("Empate"); break;
                    case 'L': System.out.println("Gana Jugador"); break;
                    case 'T': System.out.println("Gana Robot"); break;
                }

                break;

            case 'L':

                switch (opcionJugador) {

                    case 'L': System.out.println("Empate"); break;
                    case 'T': System.out.println("Gana Jugador"); break;
                    case 'P': System.out.println("Gana Robot"); break;
                }

                break; 
                
            case 'T':

                switch (opcionJugador) {

                    case 'T': System.out.println("Empate"); break;
                    case 'P': System.out.println("Gana Jugador"); break;
                    case 'L': System.out.println("Gana Robot"); break;
                }

                break;

            default:
                throw new AssertionError();
        }

    















    }
}
