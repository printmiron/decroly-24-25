
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        String opcion = null;
        do {
            System.out.println("1. Crear y registar VideoClub en la franquicia");
            System.out.println("2. Registar pelicula en videoclub");
            System.out.println("3. Crear y registar cliente en videoclub");
            System.out.println("4. Alquilar pelicula");
            System.out.println("5. Devolver pelicula");
            System.out.println("6. Dar de baja cliente");
            System.out.println("7. Dar de baja pelicula");
            System.out.println("8. Salir");
            switch (sc.nextLine()) {
                case "1":
                        System.out.println("Introduce el nombre del VideoClub: ");
                        String nombreVC = sc.nextLine();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "8":
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (!"8".equals(opcion));

    }
}
