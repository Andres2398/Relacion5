package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// A partir del DNI de una persona, calcule la letra del NIF. Para ello se debe utilizar la
		//siguiente tabla unidimensional de 23 elementos de tipo carácter: 
		
		
		//iniciar array de las letras
		char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		int porcentaje=0;
		char letra;
		
		System.out.println("introduce el NIF");
		Scanner sc= new Scanner(System.in);
		int nif = sc.nextInt();
		
		// calcular la letra del dni
		porcentaje=nif%23;
		
	
		letra=letras[porcentaje];
		
		System.out.println("tu letra es la " + letra);
	}
	
}
