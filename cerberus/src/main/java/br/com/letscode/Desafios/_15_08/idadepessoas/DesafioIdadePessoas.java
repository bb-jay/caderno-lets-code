package br.com.letscode.Desafios._15_08.idadepessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesafioIdadePessoas {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(new Pessoa()
				.setNome("Gustavo")
				.setDataDeNascimento("03-07-95"));

		pessoas.add(new Pessoa()
				.setNome("João")
				.setDataDeNascimento("26-09-88"));

		pessoas.add(new Pessoa()
				.setNome("Maria")
				.setDataDeNascimento("20-03-55"));

		pessoas.add(new Pessoa()
				.setNome("Carlos")
				.setDataDeNascimento("15-12-61"));

		pessoas.add(new Pessoa()
				.setNome("Gabriela")
				.setDataDeNascimento("11-11-06"));

		System.out.println(calculaIdade(pessoas));

	}

	private static Map<Pessoa, Integer> calculaIdade(List<Pessoa> pessoas) {
		Map<Pessoa, Integer> idades = new HashMap<>();

		pessoas
				.forEach(pessoa -> {
					int idade = Period.between(pessoa.getDataDeNascimento(), LocalDate.now()).getYears();
					idades.put(pessoa, idade);
				});

		return idades;
	}
}
