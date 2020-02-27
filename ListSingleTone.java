/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de Ivan Salas, 10 de abril 2014, extraido de: https://programandoointentandolo.com/2014/04/patron-singleton-java.html
 *
 */
public class ListSingleTone {
    private static Calculadora instanciaUnica = new Calculadora();
 
    private ListSingleTone() {}
 
    public static Calculadora getInstance() {
        return instanciaUnica;
    }
}   