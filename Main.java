package jugador;

import equipo.Equipo;
import jugador.Jugador;
import jugador.portero.Portero;
import jugador.defensa.Lateral;
import jugador.defensa.Central;
import jugador.centrocampista.Pivote;
import jugador.centrocampista.MediaPunta;
import jugador.delantero.Extremo;
import jugador.delantero.DelanteroCentro;

public class main {

	public static void main(String[] args) {

		Equipo equipo = new Equipo();

		Jugador portero = new Portero("Casillas", 1, "Real Madrid", 150);
		Jugador lateralIzquierdo = new Lateral("Marcelo", 12, "Real Madrid", 50, "Izquierdo");
		Jugador central1 = new Central("Ramos", 4, "Real Madrid", 80, 30);
		Jugador central2 = new Central("Varane", 5, "Real Madrid", 70, 25);
		Jugador lateralDerecho = new Lateral("Carvajal", 2, "Real Madrid", 45, "Derecho");
		Jugador pivote1 = new Pivote("Casemiro", 14, "Real Madrid", 60, 40);
		Jugador pivote2 = new Pivote("Kroos", 8, "Real Madrid", 70, 50);
		Jugador mediapunta = new MediaPunta("Modric", 10, "Real Madrid", 80, 60);
		Jugador extremoIzquierdo = new Extremo("Vinicius", 20, "Real Madrid", 30, "Izquierdo");
		Jugador extremoDerecho = new Extremo("Asensio", 11, "Real Madrid", 35, "Derecho");
		Jugador delanteroCentro = new DelanteroCentro("Benzema", 9, "Real Madrid", 100, 10);

		equipo.añadirJugador(portero, 0);
        	equipo.añadirJugador(lateralIzquierdo, 1);
        	equipo.añadirJugador(central1, 2);
        	equipo.añadirJugador(central2, 3);
        	equipo.añadirJugador(lateralDerecho, 4);
        	equipo.añadirJugador(pivote1, 5);
        	equipo.añadirJugador(pivote2, 6);
        	equipo.añadirJugador(mediapunta, 7);
        	equipo.añadirJugador(extremoIzquierdo, 8);
        	equipo.añadirJugador(extremoDerecho, 9);
        	equipo.añadirJugador(delanteroCentro, 10);
		
        	for (int i = 0; i < equipo.getAlineacion().length; i++) {
            		Jugador ju = equipo.getAlineacion()[i];
            		if (ju != null) {
                		ju.mostrarDatos();
            		}
        	}
		equipo.mostrarAlineacion();
	}
}
