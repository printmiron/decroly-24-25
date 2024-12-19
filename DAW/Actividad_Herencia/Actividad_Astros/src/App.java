
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String opcionMenu;
        

        do {
            System.out.println("1. Registrar Astro");
            System.out.println("2. Mostra los astros y elige uno para ingresar una planeta dentro");
            System.out.println("3. Mostrar todos los Astros con sus planetas y satelites");
            System.out.println("4. Salir");
            opcionMenu = sc.nextLine();

            switch (opcionMenu) {
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

                    Astros astros = new Astros(radio_ecuatorial, rotacion_sobre_su_eje, temperatura_media, gravedad);

                    break;

                case "2":

                    System.out.println(astros.toString());
                    


                    break;

                case "3":

                    


                    break;

                case "4":
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (!"4".equals(opcionMenu));

        sc.close();

    }
}
// //Introducir Planetas
// Planetas p = new Planetas(radio_ecuatorial, radio_ecuatorial, radio_ecuatorial, radio_ecuatorial, radio_ecuatorial, radio_ecuatorial, false);

// System.out.println("Introduce distancia al sol de la planeta: ");
// double distancia_al_sol = sc.nextDouble();
// System.out.println("Introduce la distancia orbita al sol: ");
// double orbita_al_sol = sc.nextDouble();
// System.out.println("Tiene satelites? : ");
// boolean tiene_satelites = sc.nextBoolean();
// if (tiene_satelites == true) {
//     //Introducir Satelites
//     Satelites s = new Satelites(0, 0, 0, 0, 0, 0, 0);
//     System.out.println("Introduce distancia del satelite de la planeta: ");
//     double distancia_al_planeta = sc.nextDouble();
//     System.out.println("Introduce orbita planetaria: ");
//     double orbita_planetaria = sc.nextDouble();
//     System.out.println("Introduce planeta al que pertenece el satelite: ");
//     double planeta_al_que_pertenece = sc.nextDouble();
// }else{
//     System.out.println("No hay satelites!");
// }
