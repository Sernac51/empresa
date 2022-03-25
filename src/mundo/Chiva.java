package mundo;

public class Chiva 
{
	private String nombre;
	private int capacidad;
	private int pasajerosPermitidos;
	private int cantidadSillas;
	private double precioHora;
	private double horasAlquiladas;

	public double calcularAlquilerChiva( )
	{
		return precioHora * horasAlquiladas;
	
	}
	public double calcularDineroRecaudado( )
	{
		return calcularAlquilerChiva( );
	}
	
	public Chiva(String pNombre, int pCapacidad, int pPasajerosPermitidos, int pCantidadSillas , double pPrecioHora, double pHorasAlquiladas)
	{
		nombre = pNombre;
		capacidad = pCapacidad;
		pasajerosPermitidos = pPasajerosPermitidos;
		cantidadSillas = pCantidadSillas;
		precioHora = pPrecioHora;
		horasAlquiladas = pHorasAlquiladas;
	}
		
	public String getNombre( )
	{
		return nombre;
	}
	public int getCapacidad( )
	{
		return capacidad;
	}
	public int getPasajerosPermitidos( )
	{
		return pasajerosPermitidos;
	}
	public int getCantidadSillas( )
	{
		return cantidadSillas;
	}
	public double getPrecioHora( )
	{
		return precioHora;
	}
	public double getHorasAlquiladas( )
	{
		return horasAlquiladas;
	}

	public void setNombre(String pNombre)
	{
		nombre = pNombre;
	}
	
	public void setCapacidad(int pCapacidad)
	{
		capacidad = pCapacidad;
	}
	public void setPasajerosPermitidos(int pPasajerosPermitidos)
	{
		pasajerosPermitidos = pPasajerosPermitidos;
	}
	public void setCantidadSillas(int pCantidadSillas)
	{
		cantidadSillas = pCantidadSillas;
	}
	public void setPrecioHora(double pPrecioHora)
	{
		 precioHora = pPrecioHora;
	}
	public void setHorasAlquiladas(double pHorasAlquiladas)
	{
		horasAlquiladas = pHorasAlquiladas;
	}




}