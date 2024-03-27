package equipo;

import jugador.Jugador;

public class Equipo {

  private Jugador[] alineacion;

  public Equipo() {
    this.alineacion = new Jugador[11];
  }

  public void añadirJugador(Jugador jugador, int posicion){
    alineacion[posicion] = jugador;
  }

  public void mostrarAlineacion() {
        System.out.println("Alineación:");
        for (int i = 0; i < alineacion.length; i++) {
            if (alineacion[i] != null) {
                System.out.println(i + ": " + alineacion[i]);
            } else {
                System.out.println(i + ": Vacío");
            }
        }
    }

  public void verificarAlineacionCompleta() throws Exception {
        for (Jugador jugador : alineacion) {
            if (jugador == null) {
                throw new IllegalArgumentException("No se ha completado la alineación.");
            }
        }
    }
}
