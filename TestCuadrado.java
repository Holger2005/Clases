package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		//Cuadrado uno
		
		 Cuadrado r1 = new Cuadrado();
		 
		 r1.setLado(3);
		 double area;
		 double perimetro;
		 
		 area = r1.calcularArea();
		 System.out.println("Area del cuadrado uno es: " + area);
		 
		 perimetro = r1.calcularPerimetro();
		 System.out.println("Perimetro del cuadrado uno es: " + perimetro);
		 
		//Cuadrado dos
			
		 Cuadrado r2 = new Cuadrado();
		 
		 r2.setLado(4);
		 double area2;
		 double perimetro2;
		 
		 area2 = r2.calcularArea();
		 System.out.println("Area del cuadrado dos es: " + area2);
		 
		 perimetro2 = r2.calcularPerimetro();
		 System.out.println("Perimetro del cuadrado dos es: " + perimetro2);
		 
		//Cuadrado tres
			
		 Cuadrado r3 = new Cuadrado();
		 
		 r3.setLado(6);
		 double area3;
		 double perimetro3;
		 
		 area3 = r3.calcularArea();
		 System.out.println("Area del cuadrado tres es: " + area3);
		 
		 perimetro3 = r3.calcularPerimetro();
		 System.out.println("Perimetro del cuadrado tres es: " + perimetro3);
		 
	}

}
