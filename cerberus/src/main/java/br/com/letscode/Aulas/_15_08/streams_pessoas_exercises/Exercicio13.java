package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio13 {

	/**
	 * Exercícios de streams
	 * 1 - Retornar o estado com mais filhos
	 * 2 - Imprimir a seguinte mensagem, interpolando as chaves pelos resultados
	 * encontrados
	 * "O estado com mais filhos é: [NOME_DO_ESTADO] o total de filhos são:
	 * [TOTAL_DE_FILHOS]
	 */

	public static void main(String[] args) {

		BancoDeDados.pegaPessoas()
				.stream()
				.collect(Collectors.groupingBy(Pessoa::getUf, Collectors.summingInt(Pessoa::getFilhos)))
				.entrySet()
				.stream()
				.max(Comparator.comparing(Map.Entry::getValue))
				.ifPresent(entry -> System.out.printf("O estado com mais filhos é: %s. O total de filhos são: %d",
						entry.getKey(), entry.getValue()));

	}

}
