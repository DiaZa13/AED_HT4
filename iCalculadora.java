/**
 * 
 * @author Diana Zaray Corado #191025 & Javier Alejandro Cotto #19324
 * @version 4/02/20
 *
 */
public interface iCalculadora {
	
	//post: returns the sum of the values
	public int sumar (int operando1, int operando2);
	
	//post: returns the substract of the values
	public int restar (int operando1, int operando2);
	
	//post: returns the product of the values
	public int multiplicar (int operando1, int operando2);
	
	//post: returns the division of the values
	public int dividir(int operando1, int operando2);

}
