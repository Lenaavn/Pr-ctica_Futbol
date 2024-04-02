package jugador.centrocampista;

import jugador.Jugador;

public abstract class Centrocampista extends Jugador {

	// Atributos
	private int pasesCompletados;

	// Constructores
	public Centrocampista(String nombre, int dorsal, String equipo, String posicion, int pasesCompletados) {
		super(nombre, dorsal, equipo, posicion);

		this.pasesCompletados = pasesCompletados;
	}

	// Getters y setters
	public int getPasesCompletados() {
		return this.pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}

}