package mockito;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import testes.unitarios.Livro;

public class TestMock {
	
	static IPilhaDao pilhaDao = mock(IPilhaDao.class);
	static Pilha2 pilha = new Pilha2(pilhaDao);
	
	@Test
	public void testRetiraUltimoLivro() {
		Livro livro = new Livro("A fortaleza");
		pilha.push(livro);
		Livro livro2 = new Livro("Homem de Ferro");
		pilha.push(livro2);
		
		String resultadoEsperado = "A fortaleza";
		
		assertTrue(pilha.pop().getTitulo() == resultadoEsperado);
	}
	
	
	@Test
	public void testNaoAdicionaAlemLimiteComException() {
		Livro livro1 = new Livro("A Terra");
		Livro livro2 = new Livro("A Roda");
		Livro livro3 = new Livro("A Lua");
		Livro livro4 = new Livro("A Maré");
		Livro livro5 = new Livro("A Vida");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		
		assertThrows(ArrayStoreException.class, () -> {
			pilha.push(new Livro("A volta ao mundo"));
		});

		System.out.println("executou testNaoAdicionaAlemLimiteComException");
	}

	@Test
	public void testNaoAdiconaLivroForaPadraoNome() {
		pilha.pop();
		pilha.push(new Livro("Nao vale"));
		Livro livro = pilha.pop();

		assertTrue("A Maré" == livro.getTitulo());
		System.out.println("executou testNaoAdiconaLivroForaPadraoNome");
	}
	
	
}
