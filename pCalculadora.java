/**
 * @author Diana Zaray Corado && Javier Alejandro Cotto
 * @author Adaptado de: Lectura_y_Escritura_de_Ficheros_en_Java
 * @see //chuwiki.chuidiang.org/index.php?
 * @version 26/02/2020
 * Clase que se encarga de leer y mostrar datos al usuario
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class pCalculadora <E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackFactory<String> sFactory = new StackFactory<String>();
		Scanner read = new Scanner(System.in);
		iCalculadora calculadora = new Calculadora();
		
		boolean error = false,tmenu,tmenub;
		int operando1, operando2;
		int contn = 0, conto = 0,a = 0;
		String cadena,menu,menub;
		
		System.out.println("------- HT4 VECTOR, ARRAYLIST y LIST ---------");
		System.out.println("1. Implementacion por medio de  Vector");
		System.out.println("2. Implementacion por medio de  ArrayList");
		System.out.println("3. Implementacion por medio de  Listas");
		System.out.print("Ingrese el numero de la opcion que desee probar: ");
		menu = read.nextLine();
		tmenu = MenuInvalido(menu);
		while (tmenu != false) {
			System.out.print("Ingrese nuevamente el numero de la opcion que desee: ");	
			menu = read.nextLine();
			tmenu = MenuInvalido(menu);
		}
		
		iStack<String> stack = sFactory.getStack(menu);
		
		cadena = readFile();
		String [] cadLista = cadena.split(" ");
		
			while(a < cadLista.length) {
	    		if(cadLista[a].equals("1") || cadLista[a].equals("2") || cadLista[a].equals("3") || cadLista[a].equals("4") || cadLista[a].equals("5") || cadLista[a].equals("6") || cadLista[a].equals("7") || cadLista[a].equals("8") || cadLista[a].equals("9") || cadLista[a].equals("0"))
	    			contn = contn + 1;
	    		if(cadLista[a].equals("+") || cadLista[a].equals("-") || cadLista[a].equals("*") || cadLista[a].equals("/"))
	    			conto = conto +1;
	    		a++;
	    		}
			
			if(contn == (conto + 1)) {
    		
	    	for(int i=0; i<cadLista.length;i++){
	    		
	    		 if(cadLista[i].equals("+")) {
	    				try {
		    				operando1 = Integer.valueOf(stack.pop());
							operando2 = Integer.valueOf(stack.pop());
							stack.push(String.valueOf(calculadora.sumar(operando1,operando2)));
		    			}catch(Exception e) {
		    				//error = true;
		    				}
	    		}else if(cadLista[i].equals("-")) {
	    				try {
	    				operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.restar(operando1,operando2)));
						}catch(Exception e) {
							//error = true;
						}
	    				
	    		}else if(cadLista[i].equals("*")) {
	    				try {
	    				operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.multiplicar(operando1,operando2)));
						}catch(Exception e) {
							//error = true;
						}
		    	}else if(cadLista[i].equals("/")) {
		    			try {
		    			operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.dividir(operando2,operando1)));
						}catch(Exception e) {
							//error = true;
					}
	    		}
		    	else
		    		stack.push(cadLista[i]);
	    	}
	       	   	
	    }else
	    	error = true;
	    	
	    	
	   	if(error != true) {
	   	   	System.out.println("El resultado es: " + stack.pop());
	   	   		
	   	  }
	   	else {
	   	   	System.out.println("La operacion no se pudo realizar");   	   		
	   	  }
	}
	 
				
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

			
		

	


