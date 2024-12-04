
//Insertar tipos (generos) de prliculas

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
                        String nombre = sc.nextLine();

                        System.out.println("Introduce el CIF: ");
                        String cif = sc.nextLine();

                        System.out.println("Y su direccion: ");
                        String direccion = sc.nextLine();

                        VideoDAW VideoClub = new VideoDAW(nombre, cif, direccion);
                    break;

                case "2":
                        System.out.println("Introduce el titulo del libro: ");
                        String titulo = sc.nextLine();

                        System.out.println("Introduce su genero /n"+
                        "Tipos: " );
                        String genero = sc.nextLine();

                        Pelicula regPelicula = new Pelicula(0, titulo, genero);
                    break;
                case "3":
                        final String patronDNI = "[A-Z][0-9]{7}[A-Z]";
                        String dni = Utils.comprobarPatronRepetidamente(patronDNI, "Introduce su DNI: Ejemplo (Y7665861K)");


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
