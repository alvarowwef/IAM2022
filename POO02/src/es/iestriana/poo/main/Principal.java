package es.iestriana.poo.main;

import es.iestriana.poo.datos.Circulo;
import es.iestriana.poo.datos.Punto;
import es.iestriana.poo.datos.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Punto a = new Punto();
		Punto b = new Punto(1.1, 4.3);
		System.out.println("La distancia entre a y b es " 
								+ a.calcularDistanciaDesde(b));
		
		Circulo c = new Circulo(2, 3, 5.3);
		System.out.println("�rea: " + c.calcularArea());
		System.out.println("Per�metro: " + c.calcularPerimetro());
		System.out.println("La distancia del centro a b es: " + c.calcularDistanciaDesde(b));
		
		Triangulo t = new Triangulo(a, b, new Punto(4, 5));
		System.out.println("�rea: " + t.calcularArea());
		System.out.println("Per�metro: " + t.calcularPerimetro());
		System.out.println("La distancia de p1 a b es: " + t.calcularDistanciaDesde(b));
		
	}

}