package jugador.defensa;

public class Central extends Defensa {

	// Atributos
	private int entradas;

	// Constructores
	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(disputasRealizadas, nombre, dorsal, equipo);
		this.entradas = entradas;
	}

	// Getters y setters
	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	// Métodos
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + ", Dorsal: " + this.getDorsal() + ", Posición: " + this.getPosicion()
				+ ", Entradas: " + this.entradas + ", DisputasRealizadas: " + this.getDisputasRealizadas();
	}

}