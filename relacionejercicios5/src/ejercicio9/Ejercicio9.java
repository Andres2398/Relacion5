package ejercicio9;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Dado un array asignar los elementos de dirección impar al array impar y los 
		//elementos de dirección par al array par.
		
		System.out.println("introduce el tamaño de los arrays");
		Scanner sc = new Scanner(System.in);
		int tamaño = sc.nextInt();
		
		int [] par = new int [tamaño];
		int [] impar = new int [tamaño];
		int numero=0;
		Random r = new Random();
		int a=0;
		int b=0;
		numero=0;
		while (a<par.length && b< impar.length) {
				numero =r.nextInt(100);
				if(numero%2==0) {
					
				par[a]=numero;
				a++;
				}else {
				 impar[b]=numero;
				 b++;
				}
			
			
		}
		for (int i = 0; i < impar.length; i++) {
			System.out.println("conjunto impar " + impar[i]);
		}
		for (int i = 0; i < par.length; i++) {
			System.out.println("conjunto par " + par[i]);
		}
	}
	
}