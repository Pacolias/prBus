package bus;

public class PruebaParada {

	public static void main(String[] args) {

		Parada p1 = new Parada("Louis Pasteur", 36.71654, -4.47508);
		Parada p2 = new Parada("Paseo del Parque", 36.71884, -4.41910);
		Parada p3 = new Parada("Pedregalejo", 36.72219, -4.37708);

		if (p1.distancia(p2) > p2.distancia(p3)) {
			System.out.print("La distancia entre " + p1.getNombre() + " y " + p2.getNombre()
					+ " es mayor que la distancia" + " entre " + p2.getNombre() + " y " + p3.getNombre());
		} else {
			System.out.print("La distancia entre " + p1.getNombre() + " y " + p2.getNombre()
			+ " es menor que la distancia" + " entre " + p2.getNombre() + " y " + p3.getNombre());
		}

	}

}
