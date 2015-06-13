package src.domain;

public class Bibliotecario {

	public boolean cadastra(Livro livro) {
		Acervo acervo = Acervo.getInstance();
		
		return acervo.cadastraLivro(livro);
	}
}
