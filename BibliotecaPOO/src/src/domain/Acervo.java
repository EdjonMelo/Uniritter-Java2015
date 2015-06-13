package src.domain;

import java.util.ArrayList;
import java.util.List;


public class Acervo {
	
	private static Acervo acervo;
	private List<Livro> livros;
	
	private Acervo() {
		livros = new ArrayList<Livro>();
	}
	
	public static Acervo getInstance() {
		if (acervo == null) return acervo = new Acervo();
		return acervo;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public boolean cadastraLivro(Livro livro) {
		return livros.add(livro);		
	}
	
}
