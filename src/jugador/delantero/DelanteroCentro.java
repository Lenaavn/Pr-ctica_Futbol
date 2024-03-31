package jugador.delantero;

public class DelanteroCentro extends Delantero {

	// Atributos
	private int golesDePenalti;

	// Constructor
	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;

	}

	// Metodos get y set
	public int getGolesDePenalti() {
		return golesDePenalti;
	}

	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return " Delantero[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo ="
				+ this.getEquipo() + ", goles=" + this.getGoles() + ", golesDePenalti=" + this.golesDePenalti + "]";
	}

}