package jugador.delantero;

public class Extremo extends Delantero {

	// Atributos
	private boolean puestoDerecho;
	private boolean puestoIzquierdo;

	// Constructor
	public Extremo(String nombre, int dorsal, String equipo, int goles, String puesto) {
		super(nombre, dorsal, equipo, goles);
		if (puesto.equalsIgnoreCase("Derecho")) {
			this.puestoDerecho = true;
			this.puestoIzquierdo = false;
		} else if (puesto.equalsIgnoreCase("Izquierdo")) {
			this.puestoDerecho = false;
			this.puestoIzquierdo = true;
		} else {
			throw new IllegalArgumentException("El puesto debe ser 'derecho' o 'izquierdo'.");
		}
	}

	// Get y set
	public boolean isPuestoDerecho() {
		return puestoDerecho;
	}

	public void setPuestoDerecho(boolean puestoDerecho) {
		this.puestoDerecho = puestoDerecho;
	}

	public boolean isPuestoIzquierdo() {
		return puestoIzquierdo;
	}

	public void setPuestoIzquierdo(boolean puestoIzquierdo) {
		this.puestoIzquierdo = puestoIzquierdo;
	}

	// Métodos
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		String puesto = this.puestoDerecho ? "Derecho" : "Izquierdo";
		return "Nombre: " + this.getNombre() + ", Dorsal: " + this.getDorsal() + ", Posición: Extremo " + puesto + ", Goles: " + this.getGoles();
	}

}