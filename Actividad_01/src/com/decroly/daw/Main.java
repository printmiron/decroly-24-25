package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio1
		System.out.println("buenos días");
		
		//Ejercicio2 
		int a = 5;
		int b = 5;
		int c = a*b; //Resultado de la multiplicacion
		System.out.println("5*5=" + c);
		
		//Ejercicio3
		Scanner scanner = new Scanner(System.in);
		System.out.print("Área: ");
		
		int lat = scanner.nextInt();
		int area = lat*lat;
		
		System.out.println("Resultado es: " + area);
		
		//Ejercicio4
		Scanner scanner1 = new Scanner(System.in);
	
		System.out.println("Primer numero: ");
		int prim = scanner.nextInt();
		
		System.out.println("Segundo numero: ");
		int segu = scanner.nextInt();
		
		System.out.println("Suma: " + (prim+segu));
		System.out.println("Resta: " + (prim-segu));
		System.out.println("Multiplicacion: " + (prim*segu));
		System.out.println("Division: " + (prim/segu));
		
		
		//Ejercicio5
		Scanner scanner2 = new Scanner(System.in);
		
	}

}
