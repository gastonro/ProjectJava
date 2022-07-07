package com.mantle.mundopc;

public class Raton extends DispositivoEntrada {
	private int idRaton;
	private static int contadorRatones;

	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = ++Raton.contadorRatones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raton [idRaton=");
		builder.append(idRaton);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
