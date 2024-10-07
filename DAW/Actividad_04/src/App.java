
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Ejercicio1
        double numero [] = new double [10];
        
        System.out.println("Insertar 10 numeros: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + ( i+1 ) + ":");
            numero[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: " + ( i+1 ) + ":" + numero[i]);
        }

        sc.close();
    }
}
