package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado = Calculadora.sumar(2,3);
		Assert.assertEquals(5, resultado); //lo que espero, y lo que tengo
	}//testSumar
	
	
	
	
	
	
	

}
