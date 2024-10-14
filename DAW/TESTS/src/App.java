
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numN = sc.nextInt();
        int numM = sc.nextInt();

        int numero [] = new int [numN];

        System.out.println("Ingresa el tamaño N: ");
        System.out.println("Ingresa el valor M: ");
        
        for (int i = 0; i < numN; i++) {
            numero[i] = numM;
        }

        System.out.println("Los valore de array son: ");
        
        for (int i = 0; i < numN; i++) {
            System.out.println("Numero[" +i+ "]" + numero[i]);
        }



        
    }
}
