/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de Douglas Barrios
 *
 */
class ListFactory<E> {

   public List<E> getStack(String entry) {

	if (entry.equals("1"))
      return new SinglyLinkedList<E>(); //Crea una instancia de Lista Simplemente Encadenada
	//else
      //return new StackVector<E>(); //Crea una instancia de Lista Doblemente Encadenada
	//else
		return new 	SinglyLinkedList<E>(); //Crea una instancia de Lista Circular
   }
}
