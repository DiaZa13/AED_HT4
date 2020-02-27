import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * 
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de Douglas Barrios
 * @version 26/02/2020
 *
 */
class StackFactory<E> {

	String menub = "";
	boolean tmenub;
	Scanner read = new Scanner(System.in);
	
	//pre:
	//post: se hace una instancia del tipo de coleccion que decida el usuario
	public iStack<E> getStack(String entry) {
	   
	if (entry.equals("1"))
      return new StackVector<E>(); //Crea una instancia de un Vector
	else if(entry.equals("2"))
      return new StackArrayList<E>(); //Crea una instancia de un ArrayList
	else {
		System.out.println("----- LISTAS ----");
		System.out.println("1. Simplemente Encadenada");
		System.out.println("2. Doblemente Encadenada");
		System.out.println("3. Lista Circular");
		System.out.print("Ingrese el numero de la opcion que desee probar: ");
		menub = read.nextLine();
		tmenub = MenuInvalido(menub);
		while (tmenub != false) {
			System.out.print("Ingrese nuevamente el numero de la opcion que desee: ");	
			menub = read.nextLine();
			tmenub = MenuInvalido(menub);
			}
		}
			return new StackList<E>(menub);
	}
   
	//pre:
	//post: se conoce si el usuario ingreso un numero incorrecto
   public static String readFile(){
		 
	 	String cadena = "", linea;
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

			try {
			fr = new FileReader ("Calculos.txt");
	        br = new BufferedReader(fr);

	        while((linea = br.readLine())!=null)
	            cadena= linea;

	    }
			catch(Exception e){
	        e.printStackTrace();
	    }finally{

	        try{
	            if( null != fr ){
	                fr.close();
	            }
	        }catch (Exception e){
	            e.printStackTrace();
	        }

			}
			return cadena;
		}
	
	 public static boolean MenuInvalido(String me) {
		 boolean incorrecto = false;
		 if (!me.equals("1") && !me.equals("2") && !me.equals("3")) 
			 incorrecto = true;
		else 
			incorrecto = false;
		 
		 return incorrecto;
	 }
	
   }

