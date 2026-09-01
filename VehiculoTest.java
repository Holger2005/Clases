package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Vehiculo v;
		
		v = new Vehiculo("Nuevo", "Chevrolet", "2012");
	
		System.out.println("==================Vehiculo 1: Valores asignados==============");
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		
		System.out.println("==================Vehiculo 2: Valores asignados==============");
		Vehiculo v2 = new Vehiculo("El mas rapido", "Chevrolet", "2026");
		
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		
	}

}
