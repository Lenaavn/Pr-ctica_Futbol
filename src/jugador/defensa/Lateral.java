package jugador.defensa;

public class Lateral extends Defensa {

	// Atributos
	private boolean puestoDerecho;
	private boolean puestoIzquierdo;

	// Constructores
	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(disputasRealizadas, nombre, dorsal, equipo);
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

	// Getters y setters
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
		return "Nombre: " + this.getNombre() + ", Dorsal: " + this.getDorsal() + ", Posición: Lateral " + puesto + ", DisputasRealizadas: " + this.getDisputasRealizadas();
	}

}