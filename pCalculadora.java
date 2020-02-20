import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;


public class pCalculadora <E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		iCalculadora calculadora = new Calculadora();
		boolean error = false;
		String cadena;
		int operando1, operando2;
		int contn = 0, conto = 0,a = 0;

		try{
			FileReader f = new FileReader("C:\\Users\\claudia\\Desktop\\Algortimos y Estructuras de Datos\\HT_2\\src/Calculos.txt");

	      BufferedReader b = new BufferedReader(f);
	      while((cadena = b.readLine())!=null) {

	    	System.out.println("La operacion a realizar es: " + cadena);
	    	String[] cadLista = cadena.split(" ");
	    	
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
		    				error = true;
		    				}
	    		}else 
	    			if(cadLista[i].equals("-")) {
	    				try {
	    				operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.restar(operando1,operando2)));
						}catch(Exception e) {
							error = true;
						}
	    				
	    		}else 
	    			if(cadLista[i].equals("*")) {
	    				try {
	    				operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.multiplicar(operando1,operando2)));
						}catch(Exception e) {
							error = true;
						}
		    	}else 
		    		if(cadLista[i].equals("/")) {
		    			try {
		    			operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.dividir(operando2,operando1)));
						}catch(Exception e) {
							error = true;
						}
	    		}else {
	    				stack.push(cadLista[i]);
	    		}	
	    	}
	    
	   	   	stack.push(cadena);
	   	   	stack.pop();
	    }else
	    	error = true;
	    	
	    	
	   	   	if(error != true) {
	   	   		System.out.println("El resultado es: " + stack.pop());
	   	   		
	   	   	}
	   	   	else {
	   	   		System.out.println("La operacion no se pudo realizar");   	   		
	   	   	}
	      }
	      b.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	      
		
	}
}
			
		

	


