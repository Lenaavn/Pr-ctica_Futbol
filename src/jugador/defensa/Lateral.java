package jugador.defensa;

public class Lateral extends Defensa {

	// atributos
	private boolean puestoDerecho;
	private boolean puestoIzquierdo;

	// constructores
	public Lateral(int disputasRealizadas, boolean puestoDerecho, boolean puestoIzquierdo) {
		super(disputasRealizadas);
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

}
