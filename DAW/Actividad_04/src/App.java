
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Ejercicio1
        // double numero [] = new double [10];
        
        // System.out.println("Insertar 10 numeros: ");
        
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Numero " + ( i+1 ) + ":");
        //     numero[i] = sc.nextDouble();
        // }

        // sc.close();

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(numero[i]);
        // }


        //Ejercicio2
        // int suma = 0;
        // double numero [] = new double [10];
        
        // System.out.println("Insertar 10 numeros: ");
        
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Numero " + ( i+1 ) + ":");
        //     numero[i] = sc.nextDouble();
        // }

        // for (int i = 0; i < 10; i++) {
        //         suma += numero[i];
        //     }
    
        //     System.out.println("Suma total es: " + suma);

        //Ejercicio3
        double max = numero[0];
        double min = numero[0];
        double numero [] = new double [10];
        
        System.out.println("Insertar 10 numeros: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + ( i+1 ) + ":");
            numero[i] = sc.nextDouble();
        }

        
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > max) {
                max = numero[i];
            }

            if (numero[i] > min) {
                min = numero[i];
            }
        }

        System.out.println("Numero max: " + max);
        System.out.println("Numero min: " + min);
    }
}
