import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        //Ejercicio1

        // int matriz [][] = new int [5][5];

        // int num = 1;

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         matriz[i][j] = num ;
        //         num++;
        //     }
        // }

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.println(matriz[i][j]);
        //     }
        //     System.out.println();
        // }

        //Ejercicio2

        // int matriz [][] = new int [10][10];

        // int num = 1;

        // for (int i = 0; i < matriz.length; i++) {
        //    for (int j = 0; j < matriz.length; j++) {
        //        matriz[i][j] = num * ( j + 1 );
        //        num++;
        //    } 
        // }

        // for (int i = 0; i < matriz.length; i++) {
        //     for (int j = 0; j < matriz.length; j++) {
        //         System.out.println(matriz[i][j]);
        //     }
        //     System.out.println();
        // }

        //Ejercicio3

        
        

        // System.out.println("Introduce el tamaño N: ");
        // int N = sc.nextInt();

        // System.out.println("Introduce el tamaño M: ");
        // int M = sc.nextInt();

        // int menor = 0, mayor = 0, iguales = 0;

        // int matriz [][] = new int [N][M];

        // for (int i = 0; i < matriz.length; i++) {
        //     for (int j = 0; j < matriz.length; j++) {

        //         System.out.println("Valor N: " + (i+1) + " | valor M: " + (j+1));

        //         if (matriz[i][j] > 0) {
        //             mayor++;
        //         }else if (matriz[i][j] < 0) {
        //             menor++;
        //         }else{
        //             iguales++;
        //         }
        //     }

        // }

        // System.out.println("Mayor que cero: " + mayor);
        // System.out.println("Menor que cero: " + menor);
        // System.out.println("Igual a cero: " + iguales);


        //Ejercicio4

        // int suma = 0, minima = 0, maxima = 0, media = 0;

        // int notas [][] = new int [5][5];

        // for (int i = 0; i < notas.length; i++) {
        //     for (int j = 0; j < notas.length; j++) {
        //         System.out.println("Alumno: " + (i+1) + " | Nota: " + (j+1));
            
        //         notas[i][j] = sc.nextInt();

        //         suma += notas[i][j];

        //         if (j == 0) {
        //             minima = notas[i][j];
        //             maxima = notas[i][j];
        //         }

        //         if (minima > notas[i][j]) {
        //             minima = notas[i][j];
        //         }

        //         if (maxima < notas[i][j]) {
        //             maxima = notas[i][j];
        //         }
  
        //         System.out.println("La nota mínima del alumno " + (i+1) + " es: " + minima);
        //         System.out.println("La nota máxima del alumno " + (i+1) + " es: " + maxima);
        //         System.out.println("La nota media del alumno " + (i+1) + " es: "+ (suma/5));
        //         System.out.println("");

        //     }
        // }

        //Ejercicio5

        int hombres = 0, mujeres = 0; 
        int sumaHombres = 0; 
        int sumaMujeres = 0;

        System.out.println("Numero de personas: ");
        int num = sc.nextInt();

        int sueldos [][] = new int [num][2];

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos.length; j++) {
                
                if (j == 0) {
                    System.out.println("Inserta 0 para hombres y 1 para mujeres: " + (i+1));
                sueldos[i][j] = sc.nextInt();
                }
                
                if (j == 1) {
                    System.out.print("Sueldo: ");
                    sueldos[i][j] = sc.nextInt();
                }
            }
            
        }

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0) {
                hombres++;
                sumaHombres += sueldos[i][1];
            }
            if (sueldos[i][0] == 1) {
                mujeres++;
                sumaMujeres += sueldos[i][1];
            }
        }

        System.out.println("El sueldo medio de los hombres es: " + (sumaHombres / hombres));
        System.out.println("El sueldo medio de las mujeres es: " + (sumaMujeres / mujeres));

























    }
}
