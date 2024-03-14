package jugador.centrocampista;

import jugador.Jugador;

public class Centrocampista extends Jugador {

	// atributos
	private int pasesCompletados;

	// constructores
	public Centrocampista(int pasesCompletados) {
		super();

		this.pasesCompletados = pasesCompletados;
	}

	// getters y setters
	public int getPasesCompletados() {
		return this.pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}

	// metodos
}
