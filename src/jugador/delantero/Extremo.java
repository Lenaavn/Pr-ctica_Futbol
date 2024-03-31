package jugador.delantero;

public class Extremo extends Delantero {

	// Atributos
	private boolean puestoDerecho;
	private boolean puestoIzquierdo;

	public Extremo(String nombre, int dorsal, String equipo, int goles, boolean puestoDerecho,
			boolean puestoIzquierdo) {
		super(nombre, dorsal, equipo, goles);
		setPuestoDerecho(puestoDerecho);
		setPuestoIzquierdo(puestoIzquierdo);

	}

	// Metodos get y set
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
		return " Delantero[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo ="
				+ this.getEquipo() + ", goles=" + this.getGoles() + ", puestoDerecho=" + this.puestoDerecho
				+ ", puestoIzquierdo=" + this.puestoIzquierdo + "]";
	}

}