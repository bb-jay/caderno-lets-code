package br.com.letscode.Desafios._04_08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public class Rede {

	private Collection<No> nos = new ArrayList<>();
	private Collection<Conexao> conexoes = new ArrayList<>();

	public void adicionaConexao(int numero1, int numero2) {
		if (numero1 == numero2)
			return;

		No no1 = resgataOuAdicionaNo(numero1);
		No no2 = resgataOuAdicionaNo(numero2);

		Conexao novaConexao = new Conexao(no1, no2);
		if (conexoes.contains(novaConexao))
			return;

		conexoes.add(novaConexao);
		no1.adicionaConexao(no2);
		no2.adicionaConexao(no1);
	}

	public void removeConexao(int numero1, int numero2) {

		Conexao conexaoDeComparacao = new Conexao(new No(numero1), new No(numero2));

		if (numero1 == numero2 ||
				!nos.contains(new No(numero1)) ||
				!nos.contains(new No(numero2)) ||
				!conexoes.contains(conexaoDeComparacao))
			return;

		Conexao removida = getConexao(numero1, numero2);
		conexoes.remove(removida);
		removida.getNo1().removeConexao(removida.getNo2());
		removida.getNo2().removeConexao(removida.getNo1());

	}

	public Collection<No> getNos() {
		return Collections.unmodifiableCollection(nos);
	}

	public Collection<Conexao> getConexoes() {
		return Collections.unmodifiableCollection(conexoes);
	}

	private No resgataOuAdicionaNo(int numero) {
		Optional<No> optionalNo = getNo(numero);
		if (optionalNo.isPresent())
			return optionalNo.get();
		else {
			No novoNo = new No(numero);
			nos.add(novoNo);
			return novoNo;
		}
	}

	private Conexao getConexao(int numero1, int numero2) {
		final Conexao conexaoDeProcura = new Conexao(new No(numero1), new No(numero2));
		Optional<Conexao> conexaoEncontrada = conexoes.stream().filter(noExistente -> noExistente.equals(conexaoDeProcura))
				.findFirst();
		if (conexaoEncontrada.isPresent()) {
			return conexaoEncontrada.get();
		}
		return null;
	}

	private Optional<No> getNo(int numero) {
		final No noDeProcura = new No(numero);
		Optional<No> noEncontrado = nos.stream().filter(noExistente -> noExistente.equals(noDeProcura)).findFirst();
		return noEncontrado;
	}

}
