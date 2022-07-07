package com.mantle.mundopc;

public class Orden {
	private int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static final int MAX_COMPUTADORAS = 3;
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
	}
	public void agregarComputadora(Computadora computadora) {
		if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			this.computadoras[this.contadorComputadoras++] = computadora;
		}
		else {
			System.out.println("Orden llena");
		}
		
	}
	public void mostrarOrden() {
		System.out.println("ID orden: " + this.idOrden);
		System.out.println("Listado Orden");
		for(int i=0;i < this.contadorComputadoras;i++) {
			System.out.println("Computadora: " + this.computadoras[i]);
		}
	}
	
}
