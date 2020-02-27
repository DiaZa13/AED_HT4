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
	/**
	 * Constructor
	 * @param entry, define que implementacion se utilizara
	 */
		public StackList(String entry)
		// post: constructs a new, empty stack
		{
			lista = lFactory.getList(entry);
		}
		
	@Override
	// post: the value is added to the stack
	// will be popped next if no intervening push
	public void push(E item) {
		// TODO Auto-generated method stub
		//lista.addFirst((String) item);
		lista.addLast((String) item);
	}

	@Override
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	public E pop() {
		// TODO Auto-generated method stub
		if(lista instanceof CircularLinkedList)
			return (E) lista.removeLast();
		else
			return (E) lista.removeFirst();
	}

	@Override
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	public E peek() {
		// TODO Auto-generated method stub
		return (E) lista.getFirst();
	}

	@Override
	// post: returns the number of elements in the stack
	public int size() {
		// TODO Auto-generated method stub
		
		return lista.size();
	}

}
