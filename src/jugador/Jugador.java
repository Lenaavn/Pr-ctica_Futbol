package jugador;

public class abstract Jugador {

  private String nombre;
  private int dorasl;
  private String equipo;

  public Jugador(String nombre, int dorsal, String equipo){
    this.nombre = nombre;
    this.dorsal = dorsal;
    this.equipo = equipo;
  }

  public getNombre(){
    return this.nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public getDorsal(){
    return this.dorsal;
  }

  public void setDorsal(int dorsal){
    this.dorsal = dorsal;
  }

  public getEquipo(){
    return this.equipo;
  }

  public void setEquipo(String equipo){
    this.equipo = equipo;
  }

  public abstract void mostrarDatos();

  @Override
  public String toString() {
        return "Nombre: " + this.nombre + ", Dorsal: " + this.dorsal + ", Equipo: " + this.equipo;
  }

  @Override
   public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jugador jugador = (Jugador) obj;
        return dorsal == jugador.dorsal &&
                nombre.equals(jugador.nombre) &&
                equipo.equals(jugador.equipo);
    }
}
