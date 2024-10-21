
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        //Ejercicio1

        // System.out.println("Introduce una cadena de texto: ");
        // String texto = sc.nextLine();
        // String [] palabras = texto.split(" ");

        // for (Object palabra : palabras) {
        //     System.out.println(palabra);
        // }


        //Ejercicio2
        // System.out.println("Introduce primera cadena de texto: ");
        // String texto1 = sc.nextLine();
        
        // System.out.println("Introduce segunda cadena de texto: ");
        // String texto2 = sc.nextLine();

        // if (texto1.equalsIgnoreCase( texto2 )) {
        //     System.out.println("Son iguales");
        // }else{
        //     System.out.println("No son iguales");
        // }
        
        //Ejercicio3
        // System.out.println("Introduce su nombre: ");
        // String Nombre = sc.nextLine();
        
        // System.out.println("Introduce su primer apellido: ");
        // String Apellido1 = sc.nextLine();

        // System.out.println("Introduce su segundo apellido: ");
        // String Apellido2 = sc.nextLine();

        // String tresletrasNombre = Nombre.substring(0, 3);
        // String tresletrasApellido1 = Apellido1.substring(0, 3);
        // String tresletrasApellido2 = Apellido2.substring(0, 3);

        // System.out.println( (tresletrasNombre + tresletrasApellido1 + tresletrasApellido2).toUpperCase() );

        //Ejercicio4
        System.out.println("Introduce una cadena de texto: ");
        String texto = sc.nextLine();

        int A = 0, E = 0, I = 0, O = 0, U = 0;

        for (int i = 0; i < texto.length(); i++) {
            
            switch (texto) {

                case "a":
                    A++;
                    break;

                case "e":
                    E++;
                    break;  
                
                case "i":
                    I++;
                    break; 

                case "o":
                    O++;
                    break; 

                case "u":
                    U++;
                    break;

                default:
                    break;

                    
            }
        }







    }
}
