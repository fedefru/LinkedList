
public class Nodo {
	public int dato;
	public Nodo siguiente;

	public Nodo(){
        this.dato = 0;
        this.siguiente = null;
    }
	
	public int getValor() {
		return dato;
	}
	
	public void setValor(int dato) {
		this.dato = dato;
	}
	
	public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
