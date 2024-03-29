package jugador.centrocampista;

public class Pivote extends Centrocampista {

	// atributos
	private int intercepciones;

	// constructores
	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);

		this.intercepciones = intercepciones;
	}

	// getters and setters
	public int getIntercepciones() {
		return this.intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	// metodos
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}
	
	@Override
	public String toString() {
		return " Pivote[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo =" + this.getEquipo() 
		+ ", pasesCompletados=" + this.getPasesCompletados() + ", intercepciones=" + this.intercepciones + "]";
	}
}
