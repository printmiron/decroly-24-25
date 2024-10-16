
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
        // double numero [] = new double [10];
        
        // System.out.println("Insertar 10 numeros: ");
        
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Numero " + ( i+1 ) + ":");
        //     numero[i] = sc.nextDouble();
        // }
        // double max = numero[0];
        // double min = numero[0];
        
        // for (int i = 0; i < numero.length; i++) {
        //     if (numero[i] > max) {
        //         max = numero[i];
        //     }

        //     if (numero[i] < min) {
        //         min = numero[i];
        //     }
        // }

        // System.out.println("Numero max: " + max);
        // System.out.println("Numero min: " + min);

        //Ejercicio4

        // int positivos = 0;
        // int negativos = 0;
        // int numero [] = new int [20];
        
        // System.out.println("Insertar 10 numeros: ");
        
        // for (int i = 0; i < 20; i++) {
        //     System.out.println("Numero " + ( i+1 ) + ":");
        //     numero[i] = sc.nextInt();
        // }
        // for (int i = 0; i < numero.length; i++) {  
        //     if (numero[i] > 0) {
        //         positivos += numero[i];
        //     }

        //     if (numero[i] < 0) {
        //         negativos += numero[i];
        //     }
        // }

        //     System.out.println("Suma de numeros positivos: " + positivos);
        //     System.out.println("Suma de numeros negativos: " + negativos);

        //Ejercicio5

        // int suma = 0;
        // int media = 0;
        // int numero [] = new int [20];
        // System.out.println("Insertar 10 numeros: ");
        
        // for (int i = 0; i < 20; i++) {
        //     System.out.println("Numero " + ( i+1 ) + ":");
        //     numero[i] = sc.nextInt();
        // }

        // for (int i = 0; i < numero.length; i++) {
        //     suma += numero[i];
        // }
        // media = suma / numero.length;

        // System.out.println("La media es: " + media);

        //Ejercicio6

        // System.out.println("Ingresa el tamaño N: ");
        // int numN = sc.nextInt();
        // System.out.println("Ingresa el valor M: ");
        // int numM = sc.nextInt();

        // int numero [] = new int [numN];

        // for (int i = 0; i < numN; i++) {
        //     numero[i] = numM;
        // }

        // for (int i = 0; i < numN; i++) {
        //     System.out.println("Numero[" +i+ "]" + numero[i]);
        // }

        //Ejercicio7
        
        // System.out.println("Ingresa el valor P: ");
        // int numP = sc.nextInt();

        // System.out.println("Ingresa el valor Q: ");
        // int numQ = sc.nextInt();

        // int numN = Math.abs( numQ - numP ) + 1;

        // int numero [] = new int [numP];

        // for (int i = 0; i < numP; i++) {
        //     if (numP <= numQ) {
        //         numero[i] = numP + i;
        //     }else{
        //         numero[i] = numP - i;
        //     }
        // }

        // for (int i = 0; i < numP; i++) {
        //     System.out.println("Numero[" + i +"]" + numero[i]);
        // }

        //Ejercicio8

        // double numero[] = new double [100];

        // System.out.println("Dame un valor real R: ");
        // int numR = sc.nextInt();

        // for (int i = 0; i < 100; i++) {

        //     numero[i] = Math.random();

        //     if ( numR >= numero[i]) {
        //         System.out.println("Numeros mayores o iguales son del valor " + numR + " son: " + numero[i]);
        //     }
        // }

        //Ejercicio9

        // double numero[] = new double [100];

        // System.out.println("Dame un valor real R: ");
        // int numR = sc.nextInt();

        // for (int i = 0; i < 100; i++) {

        //     numero[i] = 1 + Math.random()*10;

        //     if ( numR >= numero[i]) {
        //         System.out.println("Numeros mayores o iguales son del valor " + numR + " son: " + numero[i]);
        //     }
        // }
        

        //Ejercicio10


        // System.out.println("Cuantas personas hay: ");
        // int persona = sc.nextInt();

        // double altura [] = new double [persona];

        // for (int i = 0; i < persona; i++) {
        //     System.out.println("Introdeuce la altura de la persona: " + ( 1 + i ));
        //     altura[i] = sc.nextDouble();
        // }        

        // double suma = 0;
        // double max = altura[0];
        // double min = altura[0];

        // for (int i = 0; i < persona; i++) {
        //     suma += altura[i];
        //     if (altura[i] > max) {
        //         max = altura[i];
        //     }

        //     if (altura[i] < min) {
        //         min = altura[i];
        //     }
        // }

        // double media = suma / persona;

        // int encima = 0;
        // int debajo = 0;

        // for (int i = 0; i < persona; i++) {
        //     if (altura[i] > media) {
        //         encima++;
        //     }

        //     if (altura[i] < media) {
        //         debajo++;
        //     }
        // }

        // System.out.println("Medias alturas: " + media);
        // System.out.println("Altura maxima: " + max);
        // System.out.println("Altura minima: " + min);
        // System.err.println("Personas por encima de la media: " + encima);
        // System.err.println("Personas por debajo de la media: " + debajo);

        //Ejercicio 11

        int valores1[] = new int [100];
        int valores2[] = new int [100];

        for (int i = 0; i < 100; i++) {
            valores1[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {
            valores2[i] = valores1.length - 1;
        }
        
        












    }
}
