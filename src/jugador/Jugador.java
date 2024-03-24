package jugador;

public abstract class Jugador {

	private String nombre;
	private int dorsal;
	private String equipo;

	public Jugador(String nombre, int dorsal, String equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return this.dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return this.equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public abstract void mostrarDatos();

	@Override
	public boolean equals(Object obj) {
		Jugador otro = (Jugador) obj;
		boolean result = false;
		if (this.dorsal == otro.dorsal) {
			result = true;
		}
		return result;
	}

}