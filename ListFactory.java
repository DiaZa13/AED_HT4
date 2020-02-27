/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de Douglas Barrios
 *
 */
class ListFactory<E> {

   public iList<E> getList(String entry) {

	if (entry.equals("1"))
      return new SinglyLinkedList<E>(); //Crea una instancia de Lista Simplemente Encadenada
	else if (entry.equals("2"))
		return new DoublyLinkedList<E>(); //Crea una instancia de Lista Doblemente Encadenada
	//else
		return new 	CircularLinkedList<E>(); //Crea una instancia de Lista Circular
   }
}
