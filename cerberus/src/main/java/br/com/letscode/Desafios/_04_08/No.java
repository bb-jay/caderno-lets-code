package br.com.letscode.Desafios._04_08;

import java.util.Collection;
import java.util.HashSet;

public class No {

	private final int numero;
	private final Collection<No> vizinhos = new HashSet<>();
	// private static boolean verboso;

	public No(int numero) {
		this.numero = numero;
	}

	public void adicionaConexao(No outroNo) {
		this.vizinhos.add(outroNo);
	}

	public void removeConexao(No outroNo) {
		this.vizinhos.remove(outroNo);
	}

	public Collection<No> getVizinhos() {
		return vizinhos;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof No))	
		return false;
		return this.numero == ((No) obj).numero;
	}

	@Override
	public int hashCode() {
		return this.numero;
	}

	@Override
	public String toString() {
		return String.format("[%d]", this.numero);
	}
}
