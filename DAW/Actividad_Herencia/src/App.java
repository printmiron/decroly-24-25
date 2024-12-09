
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<Astros> astroList = new ArrayList<>();

        String opcion = null;
        do {
            System.out.println("1. Registrar Astro");
            System.out.println("2. Mostrar todos los Astros");
            System.out.println("3. Salir");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Introduce el radio ecuatorial del astro: ");
                    double radio_ecuatorial = sc.nextDouble();

                    System.out.println("Introduce la rotacion sobre su eje: ");
                    double rotacion_sobre_su_eje = sc.nextDouble();

                    System.out.println("Introduce la temperatura media: ");
                    double temperatura_media = sc.nextDouble();

                    System.out.println("Introduce su gravedad: ");
                    double gravedad = sc.nextDouble();

                    Astros a = new Astros(radio_ecuatorial, rotacion_sobre_su_eje, temperatura_media, gravedad);

                    System.out.println("Monstrar un astro");
                    a.mostrarAstros();

                    break;

                case "2":
                        
                    break;

                case "3":
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (!"3".equals(opcion));

        sc.close();

    }
}
