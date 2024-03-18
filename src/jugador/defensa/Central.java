package jugador.defensa;

import jugador.Jugador;

public class Central extends Defensa{
	// atributos
		private int entradas;

	// constructores
		public Central(int disputasRealizadas, int entradas) {
			super(disputasRealizadas);
		this.entradas = entradas;
}
	// getters y setters

		public int getEntradas() {
			return entradas;
		}

		public void setEntradas(int entradas) {
			this.entradas = entradas;
		}
		
		
		
		
		
}
