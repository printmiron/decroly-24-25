
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        //Ejercicio1
        
        System.out.println("Escribe el numero de €: ");
        int numero = sc.nextInt();

        if (numero % 5 != 0){
            System.out.println("La cantidad tiene que ser mas que 5!");
        }else{
            if (numero >= 500) {
                System.out.println((numero / 500) + " billete/s de 500€");
                numero %= 500;
            }

            if (numero >= 200) {
                System.out.println((numero / 200) + " billete/s de 200€");
                numero %= 200;
            }

            if (numero >= 100) {
                System.out.println((numero / 100) + " billete/s de 100€");
                numero %= 100;
            }

            if (numero >= 50) {
                System.out.println((numero / 50) + " billete/s de 50€");
                numero %= 50;
            }

            if (numero >= 20) {
                System.out.println((numero / 20) + " billete/s de 20€");
                numero %= 20;
            }

            if (numero >= 10) {
                System.out.println((numero / 10) + " billete/s de 10€");
                numero %= 10;
            }

            if (numero >= 5) {
                System.out.println((numero / 5) + " billete/s de 5€");
                numero %= 5;
            }
        }

    }
}