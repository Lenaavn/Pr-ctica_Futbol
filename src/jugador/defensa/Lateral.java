package jugador.defensa;

public class Lateral extends Defensa {

	// atributos
	private boolean puestoDerecho;
	private boolean puestoIzquierdo;

	// constructores
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

	// getters y setters
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

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return " Defensa[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo =" + this.getEquipo()
				+ ",disputasRealizadas=" + this.getDisputasRealizadas() + ", puestoDerecho=" + this.puestoDerecho
				+ ", puestoIzquierdo=" + this.puestoIzquierdo + "]";
	}
}