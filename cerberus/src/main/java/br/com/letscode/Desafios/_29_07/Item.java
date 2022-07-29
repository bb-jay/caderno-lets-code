package br.com.letscode.Desafios._29_07;

public class Item {
	
	private String nome;
	private long preco;

	Item() {}
	
	Item(String nome, long precoEmCentavos) {
		this.nome = nome;
		this.preco = precoEmCentavos;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getPreco() {
		return preco;
	}
	public void setPreco(long preco) {
		this.preco = preco;
	}
}
