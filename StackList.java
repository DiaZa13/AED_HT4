import java.util.ArrayList;

/**
 * 
 * @author Diana Zaray Corado Lopez && Javier Alejandro Cotto
 * @version 26/02/2020
 * Implementacion de un Stack en Listas
 *
 */
public class StackList<E> extends AbstractStack<E> {
	
		ListFactory<String> lFactory = new ListFactory<String>();
		private iList<String> lista;
	
		public StackList(String entry)
		// post: constructs a new, empty stack
		{
			lista = lFactory.getList(entry);
		}
		
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		//lista.addFirst((String) item);
		lista.addLast((String) item);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(lista instanceof CircularLinkedList)
			return (E) lista.removeLast();
		else
			return (E) lista.removeFirst();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return (E) lista.getFirst();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		return lista.size();
	}

}
