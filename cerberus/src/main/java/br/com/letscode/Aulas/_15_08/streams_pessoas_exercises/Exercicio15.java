package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

// import java.math.BigDecimal;

public class Exercicio15 {

	/**
	 * Exercícios de streams
	 * 1 - Com base na idade das pessoas, adicionar duas cadas decimais a idade
	 * Dica: use bigDecimal
	 *
	 */

	public static void main(String[] args) {
		BancoDeDados.pegaPessoas()
				.stream()
				.forEach(p -> System.out.printf("%s: %.2f anos%n", p.getNome(), (double) p.getIdade()));
				// resposta alternativa:
				// .forEach(p -> System.out.printf("%s: %s anos%n", p.getNome(), new BigDecimal(p.getIdade()).setScale(2)));

	}

}
