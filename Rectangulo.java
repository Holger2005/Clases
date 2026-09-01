package com.krakedev;

public class Rectangulo {
	
	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double calcularPerimetro() {
		
		double calculo = (base*2) + (altura*2);
		
		return calculo;
		
	}
}
