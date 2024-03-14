package jugador.centrocampista;

public class Pivote extends Centrocampista {

	// atributos
	private int intercepciones;

	// constructores
	public Pivote(int pasesCompletados, int intercepciones) {
		super(pasesCompletados);

		this.intercepciones = intercepciones;
	}

	// getters and setters
	public int getIntercepciones() {
		return this.intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	// metodos
}
