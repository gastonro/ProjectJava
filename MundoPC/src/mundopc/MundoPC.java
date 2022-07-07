package mundopc;

import com.mantle.mundopc.*;

public class MundoPC {
	public static void main(String[] args) {
		Raton raton1 = new Raton("USB","ASUS");
		System.out.println(raton1.toString());
		Teclado teclado1 = new Teclado("USB","REDRAGON");
		Teclado teclado2 = new Teclado("USB","REDRAGON");
		Teclado teclado3 = new Teclado("USB","REDRAGON");
		System.out.println(teclado3.toString());
		Monitor monitor1 = new Monitor("LG",21);
		System.out.println(monitor1.toString());
		Computadora computadora1 = new Computadora("AMD RYZEN 5",monitor1,teclado2,raton1);
		Computadora computadora2 = new Computadora("INTEL i5",monitor1,teclado2,raton1);
		Computadora computadora3 = new Computadora("AMD RYZEN 7",monitor1,teclado2,raton1);
		System.out.println(computadora1.toString());
		
		Orden orden1 = new Orden();
		Orden orden2 = new Orden();
		
		orden1.agregarComputadora(computadora3);
		orden1.agregarComputadora(computadora2);
		orden1.agregarComputadora(computadora1);
		//orden1.agregarComputadora(computadora1);
		orden1.mostrarOrden();
		orden2.mostrarOrden();
		
		
	}
}
