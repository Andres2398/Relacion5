package ejercicio16;

import java.util.Random;

public class Ejercicio16 {
	
	
	static int parteAleatoria() {
		Random r= new Random();
		int numero=r.nextInt(11);
		
		while(numero==0) {
		 numero=r.nextInt(11);
		}
		
		
		
		return numero;
	}
	public static void main(String[] args) {
		
	
//		Una fábrica de títeres dispone, para construir la cabeza de sus muñecos, de 10 tipos 
//		de ojos, 10 tipos de narices y 10 tipos de sonrisas. La cabeza se identifica con un 
//		número de tres dígitos donde el primero indica el tipo de ojos, el segundo el tipo de 
//		nariz y el tercero el tipo de sonrisa. Por ejemplo, el siguiente código representa a un 
//		muñeco con las siguientes características: 
//		5  0 8 
//		│ │ │ 
//		│ │ └─ Sonrisa de tipo 8. 
//		│ │ 
//		│ └─── Nariz de tipo 0. 
//		│ 
//		└───── Ojos de tipo 5. 
//		Simular, mediante un programa la creación de las cabezas de los títeres teniendo en 
//		cuenta que los artesanos eligen al azar un tipo de ojos, un tipo de nariz y un tipo de 
//		sonrisa y que se crean 10.000 muñecos. Una vez realizado este proceso, presentar en 
//		pantalla el tipo de cabeza que se ha fabricado con mayor frecuencia.
		
		
		
		int [] sonrisa= new int [10];
		int [] nariz= new int [10];
		int [] ojos= new int [10];
		
		for (int i = 0; i < ojos.length; i++) {
			nariz[i]=i+1;
			ojos[i]=i+1;
			sonrisa[i]=i+1;
			
		}
		int cabezaR=0;
		int sonrisaR=0;
		int ojosR=0;
		for (int i = 0; i < 10000; i++) {
			
			cabezaR=parteAleatoria();
			sonrisaR=parteAleatoria();
			ojosR=parteAleatoria();
			
			
		}
		
		
		
		
		
	}

	
	}
	

