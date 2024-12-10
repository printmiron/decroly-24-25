
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        

        String opcion = null;
        do {
            System.out.println("1. Registrar Astro");
            System.out.println("2. Mostrar todos los Astros");
            System.out.println("3. Salir");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    //Introducir Astros
                    System.out.println("Introduce el radio ecuatorial del astro: ");
                    double radio_ecuatorial = sc.nextDouble();

                    System.out.println("Introduce la rotacion sobre su eje: ");
                    double rotacion_sobre_su_eje = sc.nextDouble();

                    System.out.println("Introduce la temperatura media: ");
                    double temperatura_media = sc.nextDouble();

                    System.out.println("Introduce su gravedad: ");
                    double gravedad = sc.nextDouble();

                    //Introducir Planetas
                    Planetas p = new Planetas(radio_ecuatorial, radio_ecuatorial, radio_ecuatorial, radio_ecuatorial, radio_ecuatorial, radio_ecuatorial, false);

                    System.out.println("Introduce distancia al sol de la planeta: ");
                    double distancia_al_sol = sc.nextDouble();

                    System.out.println("Introduce la distancia orbita al sol: ");
                    double orbita_al_sol = sc.nextDouble();

                    System.out.println("Tiene satelites? : ");
                    boolean tiene_satelites = sc.nextBoolean();
                    if (tiene_satelites) {
                        
                    }

                    //Introducir Satelites
                    Satelites s = new Satelites(0, 0, 0, 0, 0, 0, 0);

                    System.out.println("Introduce distancia del satelite de la planeta: ");
                    double distancia_al_planeta = sc.nextDouble();
                    
                    System.out.println("Introduce orbita planetaria: ");
                    double orbita_planetaria = sc.nextDouble();

                    System.out.println("Introduce planeta al que pertenece el satelite: ");
                    double planeta_al_que_pertenece = sc.nextDouble();

                    

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
