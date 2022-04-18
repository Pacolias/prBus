package bus;

import java.util.ArrayList;

public class LineaBus {

	private String nombre;
	private ArrayList<Parada> paradas;

	public LineaBus(String nombre) {
		this.nombre = nombre;
		paradas = new ArrayList<>();
	}

	public void agregar(Parada parada) {
		paradas.add(parada);
	}

	public void cambiar(String nombreParada, Parada nuevaParada) {
		int indice = numeroParada(nombreParada);

		if (indice != -1)
			paradas.set(indice, nuevaParada);
		else
			throw new RuntimeException("No existe la parada que queremos cambiar en la linea");

	}

	public boolean pasaPor(String nombreParada) {
		int indice = numeroParada(nombreParada);

		if (indice != -1)
			return true;
		else
			return false;
	}

	private int numeroParada(String nombreParada) {
		for (int i = 0; i < paradas.size(); i++) {
			if (nombreParada.equalsIgnoreCase(paradas.get(i).getNombre()))
				return i;
		}

		return -1;
	}

	public String getNombreLinea() {
		return nombre;
	}

	public Parada inicio() {
		if (paradas.size() == 0)
			throw new RuntimeException("La linea no tiene paradas");
		else
			return paradas.get(0);
	}

	public Parada fin() {
		if (paradas.size() == 0)
			throw new RuntimeException("La linea no tiene paradas");
		else
			return paradas.get(paradas.size() - 1);
	}

	public double distanciaLinea() {
		if (paradas.size() == 0) {
			return 0;
		} else {
			double distancia = 0;

			for (int i = 0; i < paradas.size() - 1; i++) {
				distancia += paradas.get(i).distancia(paradas.get(i + 1));
			}

			return distancia;
		}

	}

	public String toString() {
		String cadena = "";

		for (int i = 0; i < paradas.size(); i++) {
			cadena += paradas.get(i).toString();

			if (i < paradas.size() - 1)
				cadena += ", ";
		}

		return getNombreLinea().toUpperCase() + "[" + cadena + "]";
	}
}
