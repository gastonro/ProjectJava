package com.mantle.mundopc;

public class Monitor {
	private int idMonitor;
	private String marca;
	private double tamaño;
	private static int contadorMonitores;
	
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	
	public Monitor(String marca, double tamaño) {
		this();
		this.marca = marca;
		this.tamaño = tamaño;
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor [idMonitor=");
		builder.append(idMonitor);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", tamaño=");
		builder.append(tamaño);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
