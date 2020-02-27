/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de Douglas Barrios
 * @version 26/02/2020
 *
 */
class StackFactory<E> {

	
   public iStack<E> getStack(String entry) {
	   
	if (entry.equals("1"))
      return new StackVector<E>(); //Crea una instancia de un Vector
	else if(entry.equals("2"))
      return new StackArrayList<E>(); //Crea una instancia de un ArrayList
	else
		return new StackList<E>();
	
   }
}
