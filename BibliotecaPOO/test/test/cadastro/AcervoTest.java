package test.cadastro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import src.domain.Acervo;
import src.domain.Aluno;
import src.domain.Bibliotecario;
import src.domain.Livro;

public class AcervoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCadastraLivro() {
		Bibliotecario bb = new Bibliotecario();
		Livro livro = new Livro("1");
		assertTrue(bb.cadastra(livro));		
		
		Acervo acervo = Acervo.getInstance();
		assertEquals(1, acervo.getLivros().size());
		assertTrue(acervo.getLivros().contains(livro));		
	}
	
	@Test
	@Ignore
	public void testPesquisaLivro() {
		Aluno alu = new Aluno("00000000000", "12345", "Aluno Teste");
		
		Livro livro = new Livro("");
		livro.setTitulo("livro Teste");
		
		alu.pesquisar(livro);		
	}

}
