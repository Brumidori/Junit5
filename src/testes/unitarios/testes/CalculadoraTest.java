package testes.unitarios.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.runners.MethodSorters;

import testes.unitarios.Calculadora;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CalculadoraTest {

	//metodos sem anotacao nao sao considerados
	//@Test - metodo precisa ser public void
	//@Timeout - tempo para o teste ser interrompido
	@Test
	@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
	void testSoma() {
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 10;
		
		int resultado = calc.soma(4, 6);
		assertTrue(resultado == resultadoEsperado);
		
		//fail("Not yet implemented");
	}

	
	@Test
	//@Ignore -- ignora o Teste
	void testComNumNegativos() {
		Calculadora calc = new Calculadora();
		int resultadoEsperado = -10;
		
		int resultado = calc.soma(-4, -6);
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testDividir() {
		assertThrows(ArithmeticException.class, ()->{
			Calculadora calculadora = new Calculadora();
			int a =20;
			int b =0;
			calculadora.dividir(a, b);
		});
	}
}
