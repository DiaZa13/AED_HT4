/**
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Daune A. Bailey, Java Structures
 * @see http://dept.cs.williams.edu/~bailey/JavaStructures/Book_files/JavaStructures.pdf
 *	
 */
public abstract class AbstractList<E> implements List<E> {
	
	// post: does nothing
	public AbstractList(){
		
	}
	
	// post: returns true iff list has no elements
	public boolean isEmpty() {
		
		return size() == 0;
	}

	//pre: value is not null
	//post: returns true iff list contains an object equal to value
	public boolean contains(E value){
		
		return -1 != indexOf(value);
	}
}
