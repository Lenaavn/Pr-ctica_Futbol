package jugador;

public abstract class Jugador {

	// Atributos
	private String nombre;
	private int dorsal;
	private String equipo;
	private String posicion;

	// Constructor
	public Jugador(String nombre, int dorsal, String equipo, String posicion) {
		setDorsal(dorsal);
		this.nombre = nombre;
		this.equipo = equipo;
		this.posicion = posicion;
	}

	// Getters y setters
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
		if (dorsal <= 0) {
			throw new IllegalArgumentException("El dorsal no puede ser negativo. ");
		}
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return this.equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	

	// Método
	public abstract void mostrarDatos();

	@Override
	public boolean equals(Object obj) {
		Jugador otro = (Jugador) obj;
		boolean result = false;
		if (this.equipo == otro.equipo) {
			if (this.dorsal == otro.dorsal) {
				result = true;
			}
		}
		return result;
	}

}
