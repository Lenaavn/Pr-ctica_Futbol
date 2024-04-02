package jugador.centrocampista;

public class MediaPunta extends Centrocampista {

	// Atributos
	private int asistencias;

	// Constructores
	public MediaPunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, "MediaPunta", pasesCompletados);

		this.asistencias = asistencias;
	}

	// Getters y setters
	public int getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}

	// Metodos

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + ", Dorsal: " + this.getDorsal() + ", Posición: " + this.getPosicion()
				+ ", PasesCompletados: " + this.getPasesCompletados() + ", Asistencias: " + this.asistencias;
	}

}