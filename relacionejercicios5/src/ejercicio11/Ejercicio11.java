package ejercicio11;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
	
	 static int[] array(int[] array) {
	
		 Random r= new Random();
			int random;
		 
		 for (int i = 0; i < array.length; i++) {
			random=r.nextInt(100);
			array[i]=random;
		}
		 
		return array;
	}
		
	
	
	
	public static void main(String[] args) {
		//Averiguar si el valor de un entero, se encuentra o no en dos arrays indicando la 
		//posición o posiciones. 
		
		int[] v = new int [20];
		int[] x = new int [20];
		
		
		v=array(v);
		x=array(x);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(i  + " pimer ," + v[i]);
			System.out.println( i + " segundo, " + x[i]);
		}
		
		System.out.println("dame un valor");
		Scanner sc = new Scanner(System.in);
		int numero=sc.nextInt();
		int posicionx=-1;
		int posicionv=-1;
		for (int i = 0; i < v.length; i++) {
			if (v[i]==numero) {
				posicionv=numero;
			}
			
		}	
		for (int i = 0; i < x.length; i++) {
			if (x[i]==numero) {
						posicionx=numero;
					}
				}
				
		
			if(posicionv>-1 && posicionx>-1) 
				System.out.println("En el primer Array se encuentra en la posición " + posicionv + " y en el segundo en la poscion " + posicionx);
			else if (posicionv>-1 && posicionx==-1)
				System.out.println("En el primer Array se encuentra en la posición " + posicionv + " y en el segundo no esta");
			else if (posicionv==-1 && posicionx>-1)
				System.out.println("En el primer Array no esta y en el segundo se encuentra en la posicicon " +  posicionx);
			else System.out.println("no se encuentra en ningun Array");
			
				
		}


		
		
		
		
		
	}
	
	

