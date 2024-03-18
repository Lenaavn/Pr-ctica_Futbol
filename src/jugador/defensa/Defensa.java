package jugador.defensa;

import jugador.Jugador;

public class Defensa extends Jugador{
	// atributos
			private int disputasRealizadas;

	// constructores
			public Defensa(int disputasRealizadas) {
				super();
			this.disputasRealizadas = disputasRealizadas;
}
	// getters y setters
			public int getDisputasRealizadas() {
				return disputasRealizadas;
			}

			public void setDisputasRealizadas(int disputasRealizadas) {
				this.disputasRealizadas = disputasRealizadas;
			}
}
