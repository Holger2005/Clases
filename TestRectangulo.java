package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(2, 4);
		
		double resultadoPerimetro;
		
		resultadoPerimetro = r1.calcularPerimetro();
		
		System.out.println("Resultado del perímetro del rectángulo: " + resultadoPerimetro);
			
	}

}
