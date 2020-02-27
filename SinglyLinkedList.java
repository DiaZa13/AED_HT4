import java.util.Iterator;
/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de: Daune A. Bailey, Java Structures
 * @see http://dept.cs.williams.edu/~bailey/JavaStructures/Book_files/JavaStructures.pdf
 * @version 26/02/2020
 *
 */
public class SinglyLinkedList<E> extends AbstractList<E>
{

   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
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
  
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
   
   public boolean contains(E value)
   // pre: value is not null
   // post: returns true iff value is found in list
  {
      Node<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
   }

@Override
public void clear()// post: removes all elements from list
{
head = null;
count = 0;
}

@Override
public E remove(E value) // pre: value is not null
//post: removes first element with matching value, if any
{
Node<E> finger = head;
Node<E> previous = null;
while (finger != null &&
!finger.value().equals(value))
{
previous = finger;
finger = finger.next();
}
//finger points to target value
if (finger != null) {
//we found element to remove
if (previous == null) // it is first
{
head = finger.next();
} else { // it's not first
previous.setNext(finger.next());
}
count--;
return finger.value();
}
//didn't find it, return null
return null;
}

@Override
public E getLast() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E removeLast() {
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