package jugador.portero;

import jugador.Jugador;

public class Portero extends Jugador {

	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo);
		this.paradas = paradas;
	}
	
	public int setParadas() {
		return this.paradas;
	}
	
	public void getPartidos(int paradas) {
		this.paradas = paradas;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.print(this.toString());
	}
	
	@Override
	public String toString() {
		return "Portero[nombre= " + this.getNombre() + 
		", dorsal= " + this.getDorsal() + 
		", equipo= " + this.getEquipo() +
		", paradas= " + this.paradas + "]";
	}
}
