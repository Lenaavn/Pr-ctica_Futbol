package jugador.defensa;

import jugador.Jugador;

public abstract class Defensa extends Jugador {

	// atributos
	private int disputasRealizadas;

	// constructores
	public Defensa(int disputasRealizadas, String nombre, int dorsal, String equipo) {
		super(nombre, dorsal, equipo, "Defensa Central");
		this.disputasRealizadas = disputasRealizadas;
	}

	// getters y setters
	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}

}
