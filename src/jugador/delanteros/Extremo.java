package jugador.delanteros;

public class Extremo {
	
	//Atributos
	private boolean puestoDerecho;
	private boolean puestoIzquierdo;
	
	public Extremo (boolean puestoDerecho, boolean puestoIzquierdo) {
		
		this.puestoDerecho = puestoDerecho;
		this.puestoIzquierdo = puestoIzquierdo;
		
	}

	//Metodos get y set
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
