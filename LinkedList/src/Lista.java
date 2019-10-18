
public class Lista {
	public Nodo inicio= null;
	public int tamanio=0;
	Nodo nodito = new Nodo();
	
	public Nodo contador;
	
	
	public boolean esVacia(){
        return inicio == null;
    }
	public int getTamanio() {
		System.out.println("\nCantidad de nodos: "+tamanio);
		return tamanio;
	}
	
	public void agregarAlInicio(int valor){
		
        nodito.setValor(valor);
        nodito.setSiguiente(inicio);           
        inicio = nodito;
        System.out.println(nodito.getValor());
        tamanio++;       
    }
	
	
}
