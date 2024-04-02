package jugador.delantero;

import jugador.Jugador;

public abstract class Delantero extends Jugador {

	// Atributos
	private int goles;

	// Constructor
	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo, "Delantero Central");
		this.goles = goles;

	}

	// Metodos get y set
	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

}