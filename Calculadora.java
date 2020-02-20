/**
 * 
 * @author Diana Zaray Corado #191025 & Javier Alejandro Cotto #19324
 * Implementacion de Calculadora
 *
 */
public class Calculadora implements iCalculadora {

	@Override
	/**
	 * Sumar
	 * @param int operando1, int operando2
	 * Realiza la suma entre dos valores
	 * @return int suma
	 */
	public int sumar(int operando1, int operando2) {
		// TODO Auto-generated method stub
		int suma = 0;
		suma = operando1 + operando2;
		return suma;
	}

	@Override
	/**
	 * Restar
	 * @param int operando1, int operando2
	 * Realiza la resta entre dos valores
	 * @return int resta
	 */
	public int restar(int operando1, int operando2) {
		// TODO Auto-generated method stub
		int resta = 0;
		resta = operando1 - operando2;
		return resta;
	}

	@Override
	/**
	 * Multiplicar
	 * @param int operando1, int operando2
	 * Realiza la multiplicacion entre dos valores
	 * @return int multiplicar
	 */
	public int multiplicar(int operando1, int operando2) {
		// TODO Auto-generated method stub
		int multiplicar = 0;
		multiplicar = operando1 * operando2;
		return multiplicar;
	}

	@Override
	/**
	 * Dividir 
	 * @param int operando1, int operando2
	 * Realiza la division entre dos valores
	 * @return dividir
	 */
	public int dividir(int operando1, int operando2) {
		// TODO Auto-generated method stub
		int dividir = 0;
		try{
			dividir = (int)(operando1/operando2);
		}catch(Exception e) {
			dividir = -1;
		}
		
		return dividir;
	}

}
