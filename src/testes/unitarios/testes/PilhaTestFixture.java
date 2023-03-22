package testes.unitarios.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testes.unitarios.Livro;
import testes.unitarios.Pilha;

class PilhaTestFixture {

	private static Pilha pilha;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		System.out.println("Executou o @BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("Executou o @AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
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

		System.out.println("Executou o @Before");
	}

	@AfterEach
	void tearDown() throws Exception {
		int tamanho = pilha.contu();
		while (tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
		System.out.println("Executou @After");
	}

	@Test
	void testNaoAdicionaAlemLimite() {

		try {
			pilha.push(new Livro("A volta ao mundo"));
			fail();
		} catch (ArrayStoreException e) {
			assertTrue(true);
		}
		System.out.println("executou testNaoAdicionaAlemLimite");
	}

	@Test
	void testNaoAdicionaAlemLimiteComException() {
		
		assertThrows(ArrayStoreException.class, () -> {
			pilha.push(new Livro("A volta ao mundo"));
		});

		System.out.println("executou testNaoAdicionaAlemLimiteComException");
	}

	@Test
	void testNaoAdiconaLivroForaPadraoNome() {
		pilha.pop();
		pilha.push(new Livro("Nao vale"));
		Livro livro = pilha.pop();

		assertEquals("A Maré", livro.getTitulo());
		System.out.println("executou testNaoAdiconaLivroForaPadraoNome");
	}

}
