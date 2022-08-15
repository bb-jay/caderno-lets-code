package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

public class Exercicio8 {

	/**
	 * Exercícios de streams
	 * 1 - Verificar se a pessoa abaixo existe na Lista
	 *
	 * Pessoa thiago = new Pessoa("Thiago", 37, dao.UF.SP, true, 1);
	 *
	 */

	public static void main(String[] args) {
		if (BancoDeDados.pegaPessoas()
		.stream()
		.anyMatch(pessoa -> pessoa.equals(new Pessoa("Thiago", 37, UF.SP, true, 1))))
		System.out.println("Achei!");
	}

}
