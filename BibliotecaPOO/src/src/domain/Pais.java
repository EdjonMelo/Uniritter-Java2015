package src.domain;

public class Pais {
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	private String sigla;
	
	public Pais(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	
}
