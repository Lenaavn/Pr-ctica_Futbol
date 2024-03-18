package jugador.defensa;

public class Lateral extends Defensa{
 
	// atributos
		private boolean puestoDerecho;
		private boolean puestoIzquierdo;
	// constructores
		public Lateral(int disputasRealizadas,boolean puestoDerecho,boolean puestoIzquierdo) {
				super(disputasRealizadas);
			this.puestoDerecho = puestoDerecho;
			this.puestoIzquierdo = puestoIzquierdo;
		}
	// getters y setters
		public boolean isPuestoDerecho() {
			if (!puestoDerecho) {
		        throw new IllegalArgumentException("El puesto no está en la posición correcta.");
		    }
			return puestoDerecho;
		}
		public void setPuestoDerecho(boolean puestoDerecho) {
			this.puestoDerecho = puestoDerecho;
		}
		public boolean isPuestoIzquierdo() {
			if (!puestoIzquierdo) {
		        throw new IllegalArgumentException("El puesto no está en la posición correcta.");
		    }
			return puestoIzquierdo;
		}
		public void setPuestoIzquierdo(boolean puestoIzquierdo) {
			this.puestoIzquierdo = puestoIzquierdo;
		}
		
}
