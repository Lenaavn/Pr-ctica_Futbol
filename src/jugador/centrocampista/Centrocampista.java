package jugador.centrocampista;

import jugador.Jugador;

public class Centrocampista extends Jugador {

	// atributos
	private int pasesCompletados;

	// constructores
	public Centrocampista(String nombre, int dorsal, String equipo,int pasesCompletados) {
		super(nombre, dorsal, equipo);

		this.pasesCompletados = pasesCompletados;
	}

	// getters y setters
	public int getPasesCompletados() {
		return this.pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}

	// metodos
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}
	
	@Override
	public String toString() {
		return " Centrocampista[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo =" + this.getEquipo() 
		+ ", pasesCompletados=" + this.pasesCompletados + "]";
	}
}
