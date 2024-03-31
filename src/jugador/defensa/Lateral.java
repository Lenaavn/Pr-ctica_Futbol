package jugador.defensa;

public class Lateral extends Defensa {

	// atributos
	private boolean puestoDerecho;
	private boolean puestoIzquierdo;

	// constructores
	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, boolean puestoDerecho, boolean puestoIzquierdo) {
		super(disputasRealizadas,nombre, dorsal, equipo);
		this.puestoDerecho = puestoDerecho;
		this.puestoIzquierdo = puestoIzquierdo;
	}

	// getters y setters
	public boolean getPuestoDerecho() {
		return puestoDerecho;
	}

	public void setPuestoDerecho(boolean puestoDerecho) {
		if (!puestoDerecho) {
			throw new IllegalArgumentException("El puesto no está en la posición correcta.");
		}

		this.puestoDerecho = puestoDerecho;
	}

	public boolean getPuestoIzquierdo() {
		return puestoIzquierdo;
	}

	public void setPuestoIzquierdo(boolean puestoIzquierdo) {
		if (!puestoIzquierdo) {
			throw new IllegalArgumentException("El puesto no está en la posición correcta.");
		}

		this.puestoIzquierdo = puestoIzquierdo;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return " Defensa[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo ="
				+ this.getEquipo() + ",disputasRealizadas=" + this.getDisputasRealizadas() + ", puestoDerecho=" + this.puestoDerecho + ", puestoIzquierdo="
				+ this.puestoIzquierdo + "]";
	}
}
