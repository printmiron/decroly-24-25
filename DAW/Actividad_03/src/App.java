
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Ejercicio1
        // System.out.println("Escribe el numero de euros: ");
        // int numero = sc.nextInt();
        // if (numero % 5 != 0){
        //     System.out.println("La cantidad tiene que ser mas que 5!");
        // }else{
        //     if (numero >= 500) {
        //         System.out.println((numero / 500) + " billete/s de 500 euros");
        //         numero %= 500;
        //     }
        //     if (numero >= 200) {
        //         System.out.println((numero / 200) + " billete/s de 200 euros");
        //         numero %= 200;
        //     }
        //     if (numero >= 100) {
        //         System.out.println((numero / 100) + " billete/s de 100 euros");
        //         numero %= 100;
        //     }
        //     if (numero >= 50) {
        //         System.out.println((numero / 50) + " billete/s de 50 euros");
        //         numero %= 50;
        //     }
        //     if (numero >= 20) {
        //         System.out.println((numero / 20) + " billete/s de 20 euros");
        //         numero %= 20;
        //     }
        //     if (numero >= 10) {
        //         System.out.println((numero / 10) + " billete/s de 10 euros");
        //         numero %= 10;
        //     }
        //     if (numero >= 5) {
        //         System.out.println((numero / 5) + " billete/s de 5 euros");
        //         numero %= 5;
        //     }
        // }
        //Ejercicio2
        int opcion;

        do {

            System.out.println("Menu opciones: ");
            System.out.println("1. Suma");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Seleciona una opcion!");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Introduce primer numero: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Introduce segundo numero: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Resultado es: " + (num1 + num2));
                    break;

                case 2:

                    System.out.println("Introduce primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado es: " + (num1 - num2));
                    break;

                case 3:

                    System.out.println("Introduce primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado es: " + (num1 * num2));
                    break;

                case 4:

                    System.out.println("Introduce primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo numero: ");
                    num2 = sc.nextDouble();

                    if (num2 == 0) {
                        System.out.println("No es posible");
                    } else {
                        System.out.println("Resultado es: " + (num1 / num2));
                    }

                case 5:

                    System.out.println("Salir de programa");
                    break;

                default:
                    System.out.println("Opcion no valida!");
                    throw new AssertionError();
            }

        } while (opcion != 5);

    }
}
