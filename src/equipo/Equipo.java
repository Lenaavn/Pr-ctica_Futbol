package equipo;

import jugador.Jugador;

public class Equipo {

	// Atributos
	private Jugador[] alineacion;
	private String nombre;

	// Constructores
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.alineacion = new Jugador[11];
	}

	// Getters and setters
	public Jugador[] getAlineacion() {
		return alineacion;
	}

	public void setAlineacion(Jugador[] alineacion) {
		this.alineacion = alineacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Metodos
	public void añadirJugador(Jugador jugador, int posicion) {

		if (posicion - 1 < 0 || posicion - 1 >= alineacion.length) {
			throw new IllegalArgumentException("La posición está fuera del rango de la alineación.");
		}
		if (jugador.getEquipo() != this.nombre) {
			throw new IllegalArgumentException("El jugador no pertenece a este equipo.");
		}

		this.alineacion[posicion - 1] = jugador;

	}

	public void mostrarAlineacion() {
		System.out.println("Alineación:");
		for (int i = 0; i < alineacion.length; i++) {
			if (alineacion[i] == null) {
				throw new IllegalArgumentException("No se ha completado la alineación.");
			} else {
				System.out.println(
						i + 1 + ": Nombre: " + alineacion[i].getNombre() + ", Dorsal: " + alineacion[i].getDorsal());
			}
		}
	}
}