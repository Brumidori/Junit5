package testes.unitarios.testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyFixture {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("este método executa uma vez antes do primeiro teste");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("este método executa uma vez após o último teste");
	}
	
	@Before
	public static void setUp() throws Exception{
		System.out.println("este método executa antes de cada teste");
	}
	
	@After
	public static void tearDown() throws Exception{
		System.out.println("este método executa após cada teste");
	}
	
	@Test
	public static void test1() throws Exception{
		System.out.println("teste 1");
	}

	@Test
	public static void test2() throws Exception{
		System.out.println("teste 2");
	}
}
