package br.com.letscode.Aulas._18_07.PessoaCompraCarro;

public class Carro {
	private final String cor;

	Carro(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Possante " + this.cor;
	}

}
