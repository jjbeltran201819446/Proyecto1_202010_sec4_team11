package model.data_structures;

public interface IListaEnlazadaQueue <T> extends Iterable<T>  
{
	public void enqueue(T parte);
	
	public T dequeue ();
	
	public int darTamanio();
	
	public boolean emptyList();
	
	public Node<T> darPrimerElemento();
	
	public Node <T> darUltimoElemento();

}
