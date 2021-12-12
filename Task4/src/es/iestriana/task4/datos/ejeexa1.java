package es.iestriana.task4.datos;

import java.util.Scanner;

public class ejeexa1 {
	
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int numero = 0;
	private static int abunda = 0;
	
	public static void main(String[] args) {
		
			
		do {
			System.out.println("Dame un número ");
			numero = sc.nextInt();
		} while (numero < 10);
		
		divisores();
		
		do {
			System.out.println("Número positivo");
			abunda = sc.nextInt();
		} while (abunda < 0);
		abundante();
		
		
	}


	private static void abundante() {
		int sumadivisores = 0;
		for (int i = 1 ; i < abunda; i++) {
			if (abunda % i == 0) {
				sumadivisores = sumadivisores + i;
				System.out.println(sumadivisores);
			}
		}
		if (sumadivisores > abunda) {
			System.out.println("El número " + abunda + " es abundante");
		} else {
			System.out.println("El número " + abunda + " no es abundante");
		}
	}


	private static void divisores() {
		System.out.print("Los divisores de " + numero + " son: ");
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				System.out.print(i + " ");
			}
			
		}
		
	}

}
