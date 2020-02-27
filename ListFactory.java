/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de Douglas Barrios
 *
 * @param <E>
 */
class ListFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public iStack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
      return new StackArrayList<E>(); //regresa ArrayList
	else
      return new StackVector<E>(); //regresa Vector
   }
}
