
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


// //Ejercicio1
// int num = 0;
// System.out.println("Escribe su edad");
// num = sc.nextInt();
//  	if( num >= 18 ) {
// 		 System.out.println( num + " Eres mayor de edad");
// 	}else{
// 	 	System.out.println(num + " Eres menor de edad");
//  	}
	 
// //Ejercicio2
//	int num = 0;
//	System.out.println("Escribe su edad");
//	num = sc.nextInt();
//		
//		
//		
//		if( num >= 18 ) {
//			 System.out.println( num + " Eres mayor de edad");
//		 }else{
//			 System.out.println(num + " Eres menor de edad");
//		 }
//	 
//	 
////Ejercicio3
//	int cont;
//	
//	for (cont = 1; cont<=20; cont++)
//		System.out.println(cont + " ");
//	
//	
////Ejercicio4
//	int pares = 2;
//	
//	
//		while (pares <= 200) {
//			System.out.println(pares);
//			pares += 2;
//		}
//		
//	
//	
////Ejercicio5
//	int pares = 1;
//	
//		while (pares <= 200) {
//			System.out.println(pares);
//			pares += 1;
//		}
//	
//	
////Ejercicio6
//	int num;
//	System.out.println("Esctibe un numero: ");
//	num = sc.nextInt();
//	
//		for (int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}
//	
////Ejercicio7
//	int nota;
//	System.out.println("Escribe su nota: ");
//	nota = sc.nextInt();
//	
//	if (nota <= 3) {
//		System.out.println("Muy Deficiente");
//	}else if (nota <= 5) {
//		System.out.println("Insuficiente");
//	}else if (nota <= 6) {
//		System.out.println("Bien");
//	}else if (nota <= 8) {
//		System.out.println("Notable");
//	}else
//		System.out.println("Sobresaliente");
//	
////Ejercicio8
//	int num, i, fact = 1;
//	System.out.println("introduce un numero: ");
//	num = sc.nextInt();
//	
//	if (num < 0) {
//		System.out.println("No es posible escribir numero negativo");
//	}else if ( num >= 0 ) {
//		for (i=1;i<=num;i++){
//		      fact=fact*i;
//		  }
//		System.out.println("Su factorial es " + fact);
//	}
//		
//	
////Ejercicio9
//	int hora, minutos, segundos, num;
//	System.out.println("Escribe su hora: ");
//	hora = sc.nextInt();
//
//	System.out.println("Escribe su minutos: ");
//	minutos = sc.nextInt();
//	
//	System.out.println("Escribe su minutos: ");
//	segundos = sc.nextInt();
//	
//	num = segundos + 1;
//	
//	System.out.println(hora + " : " + minutos + " : " + num);
//	
//	
//
////Ejercicio10
//	boolean hayNegativo = false;
//	
//	for (int i = 0; i < 10; i++) {
//		System.out.println("Introduce el numero no nulo: ");
//		int numero = sc.nextInt();
//		
//		
//		while (numero == 0) {
//			System.out.println("El numero 0 no puede ser");
//			numero = sc.nextInt();
//		}
//		
//		if (numero < 0){
//			hayNegativo = true;
//		}
//	}
//	
//	
//	if (hayNegativo == true) {
//		System.out.println("Se a introducido numero negativo");
//	}else {
//		System.out.println("No hay numero negativo");
//	}
//
////Ejercicio11
//	int negativo = 0;
//	int positivo = 0;
//	
//	
//	for (int i = 0; i < 10; i++) {
//		System.out.println("Introduce el numeo no nulo: ");
//		int numero = sc.nextInt();
//		
//		
//	while (numero == 0){
//		System.out.println("El numero 0 no puede ser");
//		numero = sc.nextInt();
//		}
//	
//		if (numero < 0) {
//			negativo++;
//		}else if (numero > 0) {
//			positivo++;
//		}
//	
//	}	
//	
//	System.out.println("Numeros negativos: " + negativo);
//	System.out.println("Numeros positivo: " + positivo);
//	
////Ejercicio12
        // int negativo = 0;
        // int positivo = 0;
        // int numero;
        // boolean hayCero = false;

        // System.out.println("Introduce el numeo no nulo: ");
        
		// do {

        //     numero = sc.nextInt();

        //     if (numero < 0) {
        //         negativo++;
        //     } else if (numero > 0) {
        //         positivo++;
        //         hayCero = false;
        //     }
			
		// } while (numero != 0);


        // System.out.println("Numeros negativos: " + negativo);
        // System.out.println("Numeros positivo: " + positivo);
////Ejercicio13
        // int suma, producto;

        // suma = 0;
        // producto = 1;

        // for (int i = 1; i <= 10; i++) {
        //     suma = suma + i;
        //     producto = producto * i;
        // }

        // System.out.println("La suma es: " + suma);
        // System.out.println("El producto es: " + producto);

////Ejercicio14
        // System.out.println("Escriba su nombre: ");
        // String nombre = sc.nextLine();


        // System.out.println("Escribe cunatos horas tienes trabajado: ");
        // double horasT = sc.nextDouble();

        // double salario = 15;

        // double salarioB;
        // if (horasT <= 35) {
        //     salarioB = horasT * salario;
        // }else{
        //     double horasExtra = horasT - 35;
        //     salarioB = ( 35 * salario) + ( horasExtra * salario * 1.5 );
        // }

        // double salarioN;
        // double impuestos;

        // if (salarioB <= 500) {
        //     impuestos = 0;
        //     salarioN = salarioB;
        // }else if ( salarioB <= 900 ){
        //     impuestos = ( salarioB - 500 ) * 0.25;
        //     salarioN = salarioB - impuestos;    
        // }else{
        //     impuestos = ( 900 - 500 ) * 0.25;
        //     impuestos += ( salarioB - 900 ) * 0.45;
        //     salarioN = salarioB - impuestos;
        // }

        // System.out.println("Nombre: " + nombre);
        // System.out.println("Salario bruto: " + salarioB);
        // System.out.println("Tasas: " + impuestos);
        // System.out.println("Salario neto: " + salarioN);

        // sc.close();







    }
}
