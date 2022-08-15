package br.com.letscode.Desafios._15_08.idadepessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private LocalDate dataDeNascimento;

	public Pessoa setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Pessoa setDataDeNascimento(String dataDeNascimentoString) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yy");
		LocalDate dataPreAnalise = LocalDate.parse(dataDeNascimentoString, formatador);
		
		if (dataPreAnalise.isAfter(LocalDate.now())) {
			this.dataDeNascimento = dataPreAnalise.minusYears(100);
		} else {
			this.dataDeNascimento = dataPreAnalise;
		}
		return this;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	@Override
	public String toString() {
		return nome;
	}
}