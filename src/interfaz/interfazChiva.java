package interfaz;

import mundo.Chiva;

public class interfazChiva {

	public static void main(String[] args) 
	{
		Chiva chivas1;
		
		chivas1 = new Chiva("La rumbera",30,20,22,4500.0,4.0);
		System.out.println("Nombre es: "+chivas1.getNombre());		
		System.out.println("Capacidad: "+chivas1.getCapacidad());
		System.out.println("Pasajeros permitidos: "+chivas1.getPasajerosPermitidos());
		System.out.println("Cantidad sillas: "+chivas1.getCantidadSillas());		
		System.out.println("Precio hora: "+chivas1.getPrecioHora());
		System.out.println("Horas alquiladas: "+chivas1.getHorasAlquiladas());
		System.out.println("El alquiler es: "+chivas1.calcularAlquilerChiva());
		System.out.println("El dinero recuadado es: "+chivas1.calcularDineroRecaudado());
		System.out.println();
		
		chivas1.setNombre("La melosa");
		chivas1.setCapacidad(50);
		chivas1.setPasajerosPermitidos(45);
		chivas1.setCantidadSillas(40);
		chivas1.setPrecioHora(6000.0);
		chivas1.setHorasAlquiladas(40.0);
		
		System.out.println();
		System.out.println("Nombre es: "+chivas1.getNombre());		
		System.out.println("Capacidad: "+chivas1.getCapacidad());
		System.out.println("Pasajeros permitidos: "+chivas1.getPasajerosPermitidos());
		System.out.println("Cantidad sillas: "+chivas1.getCantidadSillas());		
		System.out.println("Precio hora: "+chivas1.getPrecioHora());
		System.out.println("Horas alquiladas: "+chivas1.getHorasAlquiladas());
		System.out.println("El alquiler es: "+chivas1.calcularAlquilerChiva());
		System.out.println("El dinero recuadado es: "+chivas1.calcularDineroRecaudado());
		

	}

}
