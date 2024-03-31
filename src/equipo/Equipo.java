package equipo;

import jugador.Jugador;

public class Equipo {

	private Jugador[] alineacion;

	public Equipo() {
		this.alineacion = new Jugador[11];
	}

	public void añadirJugador(Jugador jugador, int posicion) {

		if (posicion < 0 || posicion >= alineacion.length) {
			throw new IllegalArgumentException("La posición está fuera del rango de la alineación.");
		} else {
			for (Jugador jugadorAntiguo : alineacion) {
				if (jugadorAntiguo != null && !jugadorAntiguo.getEquipo().equals(jugador.getEquipo())) {
					throw new IllegalArgumentException("No se puede agregar el jugador " + jugador.getNombre()
							+ " porque no pertenece al mismo equipo.");
				}
			}
			alineacion[posicion] = jugador;
		}
	}

	public void mostrarAlineacion() {
		System.out.println("Alineación:");
		for (int i = 0; i < alineacion.length; i++) {
			if (alineacion[i] == null) {
				throw new IllegalArgumentException("No se ha completado la alineación.");
			} else {
				System.out.println(
						i + ": Nombre: " + alineacion[i].getNombre() + ", Dorsal: " + alineacion[i].getDorsal());
			}
		}
	}
}