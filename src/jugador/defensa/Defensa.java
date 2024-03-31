package jugador.defensa;

import jugador.Jugador;

public class Defensa extends Jugador{
	// atributos
			private int disputasRealizadas;

	// constructores
			public Defensa(int disputasRealizadas, String nombre, int dorsal, String equipo) {
				super(nombre, dorsal, equipo);
			this.disputasRealizadas = disputasRealizadas;
}
	// getters y setters
			public int getDisputasRealizadas() {
				return disputasRealizadas;
			}

			public void setDisputasRealizadas(int disputasRealizadas) {
				this.disputasRealizadas = disputasRealizadas;
			}
			
			@Override
			public void mostrarDatos() {
				System.out.println(this.toString());
				
			}
			
			@Override
			public String toString() {
				return " Defensa[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo =" + this.getEquipo() 
				+ ", disputasRealizadas=" + this.disputasRealizadas + "]";
			}
}
