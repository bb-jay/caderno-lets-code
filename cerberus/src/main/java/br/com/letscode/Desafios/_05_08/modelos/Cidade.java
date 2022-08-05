package br.com.letscode.Desafios._05_08.modelos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Cidade {
	private final String nome;
	private final Set<Cidade> destinos = new HashSet<>();

	public Cidade(String nome) {
		this.nome = nome.toUpperCase();
	}

	public void adicionaDestino(Cidade outraCidade) {
		this.destinos.add(outraCidade);
	}

	public void removeDestino(Cidade outraCidade) {
		this.destinos.remove(outraCidade);
	}

	public Set<Cidade> getDestinos() {
		return Collections.unmodifiableSet(destinos);
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cidade))
			return false;
		return this.nome.equals(((Cidade) obj).nome);
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
