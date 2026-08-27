package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		double r1;
		r1 = c1.multiplicar(10, 5);
		System.out.println("Resultado Multiplicación: " + r1);
		
		double r2;
		r2 = c1.dividir(10, 2);
		System.out.println("Resultado División: " + r2);
		
		double r3;
		r3 = c1.promediar(10, 8, 9);
		System.out.println("Resultado Promedio: " + r3);
		
		c1.mostrarResultado();
	}

}
