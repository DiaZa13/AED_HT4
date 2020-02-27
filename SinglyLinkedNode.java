/**
 * 
 *@author Daune A. Bailey, Java Structures
 *@see http://dept.cs.williams.edu/~bailey/JavaStructures/Book_files/JavaStructures.pdf
 *@version 26/02/2020
 *
 */
public class SinglyLinkedNode<E>
{
   protected E data; // value stored in this element
   protected SinglyLinkedNode<E> nextElement; // ref to next

   public SinglyLinkedNode(E v, SinglyLinkedNode<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public SinglyLinkedNode(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   public SinglyLinkedNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   public void setNext(SinglyLinkedNode<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}
