package bus;

public class LineaBusSentido extends LineaBus {

	// Si sentidoinvertido == false, entonces el bus tiene el sentido habitual. Caso
	// contrario, true, se invierte
	private boolean sentidoInvertido;

	public LineaBusSentido(String nombre) {
		super(nombre);
		sentidoInvertido = false;
	}

	public void cambiarSentido() {
		sentidoInvertido = !sentidoInvertido;
	}

	@Override
	public Parada inicio() {
		if (sentidoInvertido == false) {
			return super.inicio();
		} else {
			return super.fin();
		}
	}

	@Override
	public Parada fin() {
		if (sentidoInvertido == false) {
			return super.fin();
		} else {
			return super.inicio();
		}
	}
}
