package equipo;

import jugador.Jugador;

public class Equipo {

	private Jugador[] alineacion;

	public Equipo() {
		this.setAlineacion(new Jugador[11]);
	}

	public void añadirJugador(Jugador jugador, int posicion) {

		if (posicion < 0 || posicion >= getAlineacion().length) {
			throw new IllegalArgumentException("La posición está fuera del rango de la alineación.");
		} else {
			for (Jugador jugadorAntiguo : getAlineacion()) {
				if (jugadorAntiguo != null && !jugadorAntiguo.getEquipo().equals(jugador.getEquipo())) {
					throw new IllegalArgumentException("No se puede agregar el jugador " + jugador.getNombre()
							+ " porque no pertenece al mismo equipo.");
				}
			}
			getAlineacion()[posicion] = jugador;
		}
	}

	public void mostrarAlineacion() {
		System.out.println("Alineación:");
		for (int i = 0; i < getAlineacion().length; i++) {
			if (getAlineacion()[i] == null) {
				throw new IllegalArgumentException("No se ha completado la alineación.");
			} else {
				System.out.println(
						i + ": Nombre: " + getAlineacion()[i].getNombre() + ", Dorsal: " + getAlineacion()[i].getDorsal());
			}
		}
	}

	public Jugador[] getAlineacion() {
		return alineacion;
	}

	public void setAlineacion(Jugador[] alineacion) {
		this.alineacion = alineacion;
	}
}
