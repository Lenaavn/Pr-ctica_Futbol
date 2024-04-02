package jugador.delantero;

public class DelanteroCentro extends Delantero {

	// Atributos
	private int golesDePenalti;

	// Constructor
	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;

	}

	// Get y set
	public int getGolesDePenalti() {
		return golesDePenalti;
	}

	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}

	// Métodos
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + ", Dorsal: " + this.getDorsal() + ", Posición: " + this.getPosicion()
				+ ", Goles: " + this.getGoles() + ", GolesDePenalti: " + this.golesDePenalti;
	}

}