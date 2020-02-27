import java.util.Iterator;
/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de: Daune A. Bailey, Java Structures
 * @see http://dept.cs.williams.edu/~bailey/JavaStructures/Book_files/JavaStructures.pdf
 * @version 26/02/2020
 *
 */
public class CircularLinkedList<E> extends AbstractList<E> {
	protected Node<E> tail;
	protected int count;
	public CircularLinkedList()
	// pre: constructs a new circular list
	{
	tail = null;
	count = 0;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		// pre: value non-null
		// post: adds element to head of list
		{
		Node<E> temp = new Node<E>(value);
		if (tail == null) { // first value added
		tail = temp;
		tail.setNext(tail);
		} else { // element exists in list
		temp.setNext(tail.next());
		tail.setNext(temp);
		}
		count++;
		}
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		// pre: value non-null
		// post: adds element to tail of list
		{
		// new entry:
		addFirst(value);
		tail = tail.next();
		}
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		// pre: !isEmpty()
		// post: returns and removes value from tail of list
		{
		Node<E> finger = tail;
		while (finger.next() != tail) {
		finger = finger.next();
		}
		// finger now points to second-to-last value
		Node<E> temp = tail;
		if (finger == tail)
		{
		tail = null;
		} else {
		finger.setNext(tail.next());
		tail = finger;
		}
		count--;
		return temp.value();
		}
		}

	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

