package br.com.letscode.Desafios._21_07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Moeda {
	private final String nome;
	private final Map<Moeda, Double> conversoes = new HashMap<>();
	private static boolean verboso;
	
	public Moeda(String nome) {
		this.nome = nome;
	}

	public void adicionaConversao(Moeda outraMoeda, double conversao) {
		this.conversoes.put(outraMoeda, conversao);
	}

	public double calculaConversao(String destino, boolean verboso) {
		Moeda.verboso = verboso;
		double resultado = calculaConversao(destino);
		Moeda.verboso = false;
		return resultado;
	}

	public double calculaConversao(String destino) {
		try {
			return this.calculaConversao(destino, new ArrayList<Moeda>());
		} catch (FimDaPilhaException e) {
			return -1;
		}
	}

	private double calculaConversao(String destino, List<Moeda> pilha) throws FimDaPilhaException{
		for (Moeda outraMoeda : conversoes.keySet()) {
			if (outraMoeda.nome.equals(destino)){
				return conversoes.get(outraMoeda) * verboso(outraMoeda);
			}
		}
		
		pilha.add(this);
		for (Moeda outraMoeda : conversoes.keySet()) {
			if (pilha.contains(outraMoeda))
				continue;
			try {
				return conversoes.get(outraMoeda) * outraMoeda.calculaConversao(destino, pilha) * verboso(outraMoeda);
			} catch (FimDaPilhaException e) {
				continue;
			}
		}

		throw new FimDaPilhaException();
			
	}

	private int verboso(Moeda outraMoeda) {
		if (Moeda.verboso)
			System.out.println(outraMoeda.nome + "->" + this.nome);
		return 1;
	}
}