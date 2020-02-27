import java.util.Vector;
import java.io.*;

/**
 * 
 * @author Diana Zaray Corado #191025 && Javier Alejandro Cotto #19324
 * @version 30/01/2020
 * Implementacion de Stack en Vector
 *
 */
public class StackVector<E>  extends AbstractStack<E> {

	private Vector<E> vector = new Vector<E>();
	
	@Override
	/**
	 * Push
	 * @param E item
	 * Agregar un nuevo elemento al stack
	 * 
	 */
	// post: the value is added to the stack
	// will be popped next if no intervening push
	public void push(E item) {
		// TODO Auto-generated method stub
		vector.add(item);
		
	}

	@Override
	/**
	 * Pop
	 * Retira el ultimo elemento del stack
	 * @return E ultimo
	 */
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	public E pop() {
		// TODO Auto-generated method stub
		return vector.remove(size()-1);
	}

	@Override
	/**
	 * Peek
	 * Muestra el elemento que se encuentra en la ultima posicion en el stack
	 * @return E multimo
	 */
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	public E peek() {
		// TODO Auto-generated method stub
		return vector.get(size()-1);
	}
	
	@Override
	/**
	 * Size
	 * Devuelve el tamanio del stack
	 * @return int size
	 */
	// post: returns the number of elements in the stack
	public int size() {
		// TODO Auto-generated method stub
		return vector.size();
	}
	
}
