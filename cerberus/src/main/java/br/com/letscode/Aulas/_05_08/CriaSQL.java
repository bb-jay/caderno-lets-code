package br.com.letscode.Aulas._05_08;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CriaSQL {
	private String comando;
	private String alvo;
	private List<String> condicoes = new ArrayList<>();


	public static CriaSQL select() {
		return select("*");
	}

	public static CriaSQL select(String ... argumentos) {
		CriaSQL cria =  new CriaSQL();
		
		StringJoiner joiner = new StringJoiner(", ");
		for (String arg: argumentos) {
			joiner.add(arg);
		}
		
		cria.comando = "SELECT " + joiner.toString();
		return cria;
	} 

	public CriaSQL from(String tabela) {
		this.alvo = "FROM " + tabela;
		return this;
	}
	
	public CriaSQL where(String condicao) {
		this.condicoes.add("WHERE " + condicao);
		return this;
	}

	public CriaSQL or(String condicao) {
		this.condicoes.add("\tOR " + condicao);
		return this;
	}

	public CriaSQL and(String condicao) {
		this.condicoes.add("\tAND " + condicao);
		return this;
	}

	// private String 
	

	public void imprimeQuery() {
		StringBuilder impressao = new StringBuilder();

		impressao
				.append(comando + System.lineSeparator())
				.append(alvo + System.lineSeparator());

		for (String cond : condicoes) {
			impressao.append(cond + System.lineSeparator());
		}

		impressao.deleteCharAt(impressao.length() - 1);
		impressao.deleteCharAt(impressao.length() - 1);

		System.out.println(impressao.append(';'));
	}

}
