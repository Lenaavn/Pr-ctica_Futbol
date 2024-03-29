package jugador.centrocampista;

public class MediaPunta extends Centrocampista {

	// atributos
	private int asistencias;

	// constructores
	public MediaPunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);

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
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}
	
	@Override
	public String toString() {
		return " MediaPunta[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo =" + this.getEquipo() 
		+ ", pasesCompletados=" + this.getPasesCompletados() + ", asistencias=" + this.asistencias + "]";
	}
}
