package NumeroTeste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeroJUnitTeste {

	Numero numero;
	
	@Before
	public void setUp() throws Exception {
		numero = new Numero();
	}

	@Test
	public void testRaizCubica() {
		assertEquals("Caso 1: ", 3.0, numero.raizCubica(27), 0);
		assertEquals("Caso 2:", 2.71, numero.raizCubica(20), 0.01);
	}

	@Test
	public void testFatorial() {
		assertEquals("Caso 1: ", 120, numero.fatorial(5));
		assertEquals("Caso 2: ", 1, numero.fatorial(0));
	}

	@Test
	public void testSomaIntervalo() {
		assertEquals("Caso 1:", 15, numero.somaIntervalo(5));
		assertEquals("Caso 2: ", 0, numero.somaIntervalo(0));
	}

}
