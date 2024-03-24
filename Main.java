package jugador;

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
        Jugador mediapunta = new Mediapunta("Modric", 10, "Real Madrid", 80, 60);
        Jugador extremoIzquierdo = new Extremo("Vinicius", 20, "Real Madrid", 30, "Izquierdo");
        Jugador extremoDerecho = new Extremo("Asensio", 11, "Real Madrid", 35, "Derecho");
        Jugador delanteroCentro = new DelanteroCentro("Benzema", 9, "Real Madrid", 100, 10);
        
        Jugador[] jugadores = new Jugador[11];
        equipo.addJugador(portero, 0);
        equipo.addJugador(lateralIzquierdo, 1);
        equipo.addJugador(central1, 2);
        equipo.addJugador(central2, 3);
        equipo.addJugador(lateralDerecho, 4);
        equipo.addJugador(pivote1, 5);
        equipo.addJugador(pivote2, 6);
        equipo.addJugador(mediapunta, 7);
        equipo.addJugador(extremoIzquierdo, 8);
        equipo.addJugador(extremoDerecho, 9);
        equipo.addJugador(delanteroCentro, 10);
		
		for(Jugador ju : jugadores) {
			ju.mostrarDatos();
		}
	
    }
}



