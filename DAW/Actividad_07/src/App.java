
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Juego | Piedra, Papel, Tigera");

        System.out.println("Como se juega? \nSe tiene que elegir uno de lot tres objetos. \nDespues de elegir el la computadora random tambien elige uno de los tres objetos. \nPiedra gana tigera, tijera gana papel y papel gana peidra.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String opcionUsuario = "";

        while (!opcionUsuario.equals("S")) {
            System.out.print("Tu eleccion: ");
            opcionUsuario = scanner.nextLine().toUpperCase();

            int Robot = random.nextInt(3);
            String opcionRobot = "";
            switch (Robot) {
                case 0: opcionRobot = "P"; break;
                case 1: opcionRobot = "L"; break;
                case 2: opcionRobot = "T"; break;
            }

            if (opcionUsuario.equals("S")) {
                System.out.println("Salir");
                break;
            }

            System.out.println("Robot eligio: " + opcionRobot);

            switch (opcionUsuario) {
                case "P":
                    switch (opcionRobot) {
                        case "P":
                            System.out.println("Empate");
                            break;
                        case "L":
                            System.out.println("Perdiste");
                            break;
                        case "T":
                            System.out.println("Ganaste");
                            break;
                    }
                    break;

                case "L":
                    switch (opcionRobot) {
                        case "P":
                            System.out.println("Ganaste");
                            break;
                        case "L":
                            System.out.println("Empate");
                            break;
                        case "T":
                            System.out.println("Perdiste");
                            break;
                    }
                    break;

                case "T":
                    switch (opcionRobot) {
                        case "P":
                            System.out.println("Perdiste");
                            break;
                        case "L":
                            System.out.println("Ganaste");
                            break;
                        case "T":
                            System.out.println("Empate");
                            break;
                    }
                    break;

                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
                    break;
            }
        }


    }
}



