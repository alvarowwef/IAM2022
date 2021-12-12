package es.iestriana.task4.datos;

import java.util.Arrays;
import java.util.Random;

public class task4 {

 //  Fill in a table of 10 numbers (random values from 1 to 20). Perform a function that returns the most repeated number.	
	
	private static int [] numeros = new int[10];
	private static int [][] cadenarep = new int[10][2];
	
	public static void main(String[] args) {
		
		rellenarTabla();
		
		System.out.println(Arrays.toString(numeros));
		
		repeticiones();
		
		masrep();

	}
	
	private static void masrep() {
		int maximorep = 0;
		int masrepetido = 0;
		for (int i = 0; i < cadenarep.length; i++) {
			if (cadenarep[i][1] > maximorep) {
				maximorep = cadenarep [i][1];
				masrepetido = cadenarep [i][0];
			}
			
		}
			if (maximorep > 1) {
				System.out.println("El número más repetido es " + masrepetido + " que se repite " + maximorep + " veces.");
			}
			if (maximorep == 1) {
				System.out.println("No se repite ningún número");
			}
		
		
		
	}
	
	private static void repeticiones() {
		int repetido = 1;
		for (int i = 0; i < numeros.length; i++) {
							
			for (int j = i+1; j < numeros.length; j++) {
				
				if (numeros[i] == numeros[j]) {
				repetido++;
				}
								
			}
			
			cadenarep [i][0]= numeros[i];
			cadenarep [i][1]= repetido;
			repetido = 1;
				}
	}



	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(20)+1;
		}
	}

}
