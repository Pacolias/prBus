package bus;

public class PruebasAdicionales {

	public static void main(String[] args) {
		LineaBus linea11 = new LineaBus("L�nea 11");
		Parada[] paradas = {
				new Parada("Playa Virginia", 36.71869, -4.53217),
				new Parada("Echeverr�a", 36.72181, -4.36351),
				new Parada("Pedregalejo", 36.72248, -4.37685),
				new Parada("Paseo del Parque", 36, -4),
				new Parada("Puente de las Am�ricas", 36.71755, -4.43903),
				new Parada("Louis Pasteur", 36.71654, -4.47508)
		};
		for (Parada p: paradas) 
			linea11.agregar(p);
		
		linea11.cambiar("PASEO DEL PARQUE", new Parada("Paseo del Parque", 36.71884, -4.41910));
			
		System.out.println(linea11);
		
		System.out.println("La primera parada de " + linea11.getNombreLinea() + " es " + linea11.inicio());
		System.out.println("La �ltima parada de " + linea11.getNombreLinea() + " es " + linea11.fin());
	}

	/* SALIDA DEL PROGRAMA DE PRUEBAS
	
	L�NEA 11[PASEO DEL PARQUE(36.71884,-4.4191), ECHEVERR�A(36.72181,-4.36351), PEDREGALEJO(36.72248,-4.37685), PASEO DEL PARQUE(36.0,-4.0), PUENTE DE LAS AM�RICAS(36.71755,-4.43903), LOUIS PASTEUR(36.71654,-4.47508)]
	La primera parada de L�nea 11 es PASEO DEL PARQUE(36.71884,-4.4191)
	La �ltima parada de L�nea 11 es LOUIS PASTEUR(36.71654,-4.47508)
	 */
	
	
	/* C�DIGO CON F�RMULA HAVERSINE PARA CALCULAR LA DISTANCIA 
	 *
	 	public final static double RADIO_TIERRA = 6378.137;
	 	
	 	public static double distanciaHaversine(Parada p1, Parada p2) {
	 		// Conversi�n a radianes de latitudes y longitudes de p1 y p2
			double ltRad1 = Math.toRadians(p1.latitud);
			double lgRad1 = Math.toRadians(p1.longitud);
			double ltRad2 = Math.toRadians(p2.latitud);
			double lgRad2 = Math.toRadians(p2.longitud);
			// Se utiliza la f�rmula de Havershine para aproximar la distancia
			double distancia = RADIO_TIERRA * Math.acos(
				Math.cos(ltRad1) * Math.cos(ltRad2) * Math.cos(lgRad2 - lgRad1) + Math.sin(ltRad1) * Math.sin(ltRad2));
			return distancia;
	}
	 *
	 */
}