package jugador.centrocampista;

public class MediaPunta extends Centrocampista {

	// atributos
	private int asistencias;

	// constructores
	public MediaPunta(int pasesCompletados, int asistencias) {
		super(pasesCompletados);

		this.asistencias = asistencias;
	}

	// getters y setters
	public int getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}

	// metodos
}
