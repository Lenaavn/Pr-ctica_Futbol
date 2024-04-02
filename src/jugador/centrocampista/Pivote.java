package jugador.centrocampista;

public class Pivote extends Centrocampista {

	// Atributos
	private int intercepciones;

	// Constructores
	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, "Pivote", pasesCompletados);

		this.intercepciones = intercepciones;
	}

	// Getters and setters
	public int getIntercepciones() {
		return this.intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	// Metodos
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + ", Dorsal: " + this.getDorsal() + ", Posición: " + this.getPosicion()
				+ ", PasesCompletados: " + this.getPasesCompletados() + ", Intercepciones: " + this.intercepciones;
	}

}