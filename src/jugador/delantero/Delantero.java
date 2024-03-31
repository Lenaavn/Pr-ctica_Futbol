package jugador.delantero;

import jugador.Jugador;

public class Delantero extends Jugador {

	// Atributos
	private int goles;

	// Constructor
	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;

	}

	// Metodos get y set
	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return " Delantero[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo ="
				+ this.getEquipo() + ", goles=" + this.goles + "]";
	}
}