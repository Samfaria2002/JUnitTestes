package NumeroTeste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeroPesoJUnitTeste {

	NumeroPeso numeropeso;
	
	@Before
	public void setUp() throws Exception {
		numeropeso = new NumeroPeso();
	}

	@Test
	public void testCalculaIMC() {
		assertEquals("Caso 1: ", 5, numeropeso.calculaIMC(57, 1.71), 0);;
		assertEquals("Caso 2: ", 22, numeropeso.calculaIMC(55, 1.65), 0);
		assertEquals("Caso 3: ", 25, numeropeso.calculaIMC(54, 1.56), 0);
		assertEquals("Caso 4 ", 34, numeropeso.calculaIMC(66, 1.64), 0);
		assertEquals("Caso 5 ", 45, numeropeso.calculaIMC(78, 1.45), 0);
	}

	@Test
	public void testDefineIMC() {
		fail("Not yet implemented");
	}

}
