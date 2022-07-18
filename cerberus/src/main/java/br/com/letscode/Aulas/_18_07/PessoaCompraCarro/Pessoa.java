package br.com.letscode.Aulas._18_07.PessoaCompraCarro;

public class Pessoa {
	private final String nome;
	private final int idade;

	
	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
