package jugador.defensa;

import jugador.Jugador;

public class Central extends Defensa{
	// atributos
		private int entradas;

	// constructores
		public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
			super(disputasRealizadas, nombre, dorsal, equipo);
		this.entradas = entradas;
}
	// getters y setters

		public int getEntradas() {
			return entradas;
		}

		public void setEntradas(int entradas) {
			this.entradas = entradas;
		}
		
		@Override
		public void mostrarDatos() {
			System.out.println(this.toString());
			
		}
		
		@Override
		public String toString() {
			return " Defensa[nombre=" + this.getNombre() + ", dorsal=" + this.getDorsal() + ", equipo =" + this.getEquipo() 
			+ ", disputasRealizadas=" + this.getDisputasRealizadas() + ", entradas=" + this.entradas + "]";
		}
		
}
