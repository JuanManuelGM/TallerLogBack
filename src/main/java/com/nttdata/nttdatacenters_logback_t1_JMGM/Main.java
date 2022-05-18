package com.nttdata.nttdatacenters_logback_t1_JMGM;

import java.util.InputMismatchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Taller Práctico Logback + SLF4J
 * 
 * Clase principal
 * 
 * @author Juan Manuel Gil Medina
 *
 */

public class Main{
	
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
    public static void main( String[] args ){
    	LOG.info("INICIO del método main()");
    	
    	int num1 = 0;
    	int num2 = 0;
    	int num3 = 0;
    	
    	int suma = 0;
    	int media = 0;
    	
    	for(int i = 500; i>=0 ; i--) {
    		
    		try{
	    	num1 = (int)(Math. random()*100+1);
	    	num2 = (int)(Math. random()*100+1);
	    	num3 = (int)(Math. random()*100+1);
		    	
	    	Object[] numeros = {num1, num2, num3};
	    	
	    	LOG.debug("Numeros introducidos: {}, {}, {}.", numeros);
	    	}catch(InputMismatchException e){
	    		LOG.error("Tipo de dato introducido incorrecto");
	    	}
			int max = maximo(num1, num2, num3);
	    	System.out.println("El mayor es: " + max);
	    	suma = +max;
    	}
    	media = suma/500;
    	System.out.println("La media es: "+media);
    	LOG.info("FIN del método main()");
    }
    
	static int maximo(int num1, int num2, int num3) {
		LOG.info("INICIO del método maximo() v3");
		
		int aux = maximo(num1, num2);
		
		
		LOG.info("FIN del método maximo() v3");
		return (maximo(aux, num3));
	}

	static int maximo(int num1, int num2) {
		LOG.info("INICIO del método maximo() v2");
		
		int max;
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		
		LOG.info("FIN del método maximo() v2");
		return (max);
	}
    	
}
