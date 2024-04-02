package jugador.portero;

import jugador.Jugador;

public class Portero extends Jugador {

	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo, "Portero");
		this.paradas = paradas;
	}

	public int setParadas() {
		return this.paradas;
	}

	public void getPartidos(int paradas) {
		this.paradas = paradas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Nombre: " + this.getNombre() + ", Dorsal: " + this.getDorsal() + ", Posición: "
				+ this.getPosicion() + ", Paradas: " + this.paradas);
	}

}