import java.util.Iterator;
/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de: Daune A. Bailey, Java Structures
 * @see http://dept.cs.williams.edu/~bailey/JavaStructures/Book_files/JavaStructures.pdf
 * @version 26/02/2020
 *
 */
public class DoublyLinkedList<E> extends AbstractList<E>{
	//  protected int count;
    //protected DoublyLinkedNode<E> head;
	//}
	//public DoublyLinkedList<E> extends abstractList<E>
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;
	
	public DoublyLinkedList()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}
	public void addFirst(E value)
	// pre: value is not null
	// post: adds element to head of list
	{
	   // construct a new element, making it head
	   head = new DoublyLinkedNode<E>(value, head, null);
	   // fix tail, if necessary
	   if (tail == null) tail = head;
	   count++;
	}
	
	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
	   // construct new element
	   tail = new DoublyLinkedNode<E>(value, null, tail);
	   // fix up head
	   if (head == null) head = tail;
	   count++;
	}
	
	public E removeLast()
	// pre: list is not empty
	// post: removes value from tail of list
	{
	   DoublyLinkedNode<E> temp = tail;
	   tail = tail.previous();
	   if (tail == null) {
	       head = null;
	   } else {
	       tail.setNext(null);
	   }
	   count--;
	   return temp.value();
	}
	
	 public E removeFirst()
	  // pre: list is not empty
	  // post: removes and returns value from beginning of list
	 {
		DoublyLinkedNode<E> temp = head;
		head = head.next(); // move head down list
		count--;
		return temp.value();
	 }
	 
	 public E getFirst()
	 // pre: list is not empty
	 // post: returns first value in list
	 {
		return head.value();
	 }
	@Override
	public E get(int arg0) {
		// TODO Auto-generated method stub
		return null;
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
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
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
