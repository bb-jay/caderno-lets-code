package br.com.letscode.Desafios._05_08.modelos;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;

public class RedeDeVoos {
	private Collection<Cidade> cidades = new HashSet<>();

	public void adicionaDestino(String nome1, String nome2) {
		if (nome1.equals(nome2))
			return;

		Cidade cidade1 = resgataOuAdicionaCidade(nome1);
		Cidade cidade2 = resgataOuAdicionaCidade(nome2);

		cidade1.adicionaDestino(cidade2);
	}

	public void removeDestino(String nome1, String nome2) {

		if (nome1.equals(nome2) ||
				!cidades.contains(new Cidade(nome1)) ||
				!cidades.contains(new Cidade(nome2)))
			return;

		Cidade cidade1 = getCidade(nome1).get();
		Cidade cidade2 = getCidade(nome2).get();
		cidade1.removeDestino(cidade2);

	}

	public Optional<Cidade> getCidade(String nome) {
		final Cidade cidadeDeProcura = new Cidade(nome);
		return cidades.stream()
				.filter(cidadeExistente -> cidadeExistente.equals(cidadeDeProcura))
				.findFirst();
	}

	private Cidade resgataOuAdicionaCidade(String nome) {
		Optional<Cidade> candidata = getCidade(nome);
		if (candidata.isPresent())
			return candidata.get();

		Cidade novaCidade = new Cidade(nome);
		cidades.add(novaCidade);
		return novaCidade;

	}

	public Collection<Cidade> getCidades() {
		return Collections.unmodifiableCollection(cidades);
	}
}
