package testes.unitarios.testes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;
import testes.unitarios.Retangulo;

public class Parameterized {
	
	@ParameterizedTest
	 @CsvSource({
         "10, 20, 200",
         "10, 30, 300"
	 })
	public void testCalcularArea(int base, int altura, int area) {
		Retangulo retangulo = new Retangulo(base, altura);
		
		int resultado = retangulo.calculaArea();
		
		assertEquals(area, resultado);
	}
	
//	@ParameterizedTest
//	@Test
//	public void calcularPerimetro() {
//		
//	}
}
