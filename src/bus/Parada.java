package bus;

public class Parada {

	private String nombre;
	private double latitud;
	private double longitud;

	public final static double RADIO_TIERRA = 6378.137;

	public Parada(String nombre, double latitud, double longitud) {
		if (latitud < -90 || latitud > 90 || longitud < -180 || longitud > 180) {
			throw new RuntimeException("Lalitud o longitud erroneos");
		} else {
			this.nombre = nombre;
			this.latitud = latitud;
			this.longitud = longitud;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double distancia(Parada parada) {

		double distancia = distanciaHaversine(this, parada);
		return distancia;
	}

	public String toString() {
		return nombre.toUpperCase() + "(" + latitud + ", " + longitud + ")";
	}

	public static double distanciaHaversine(Parada p1, Parada p2) {
		// Conversión a radianes de latitudes y longitudes de p1 y p2
		double ltRad1 = Math.toRadians(p1.latitud);
		double lgRad1 = Math.toRadians(p1.longitud);
		double ltRad2 = Math.toRadians(p2.latitud);
		double lgRad2 = Math.toRadians(p2.longitud);
		// Se utiliza la fórmula de Havershine para aproximar la distancia
		double distancia = RADIO_TIERRA * Math.acos(
				Math.cos(ltRad1) * Math.cos(ltRad2) * Math.cos(lgRad2 - lgRad1) + Math.sin(ltRad1) * Math.sin(ltRad2));
		return distancia;
	}
}
