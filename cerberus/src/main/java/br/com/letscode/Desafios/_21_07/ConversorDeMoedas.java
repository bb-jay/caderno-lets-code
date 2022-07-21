package br.com.letscode.Desafios._21_07;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeMoedas {

	private static final Map<String, Moeda> moedas = new HashMap<>();
	public static void main(String[] args) {
		
		// adicionaConversao("USD", "EUR", 1);
		// adicionaConversao("BRL", "AUD", 1);
		// adicionaConversao("YEN", "PES", 1);
		// adicionaConversao("YEN", "GBP", 1);
		// adicionaConversao("BRL", "GBP", 1);
		// adicionaConversao("CAD", "GBP", 1);
		// adicionaConversao("CAD", "BRL", 1);
		// adicionaConversao("CAD", "EUR", 1);
		// adicionaConversao("CAD", "AUD", 1);
		// adicionaConversao("USD", "GBP", 1);
		// adicionaConversao("EUR", "AUD", 1);
		// double conversao = calculaConversao("EUR", "PES", true);

		adicionaConversao("USD", "AUD", 1.44);
		adicionaConversao("USD", "BRL", 5.15);
		adicionaConversao("BRL", "EUR", 0.18);
		adicionaConversao("EUR", "GBP", 0.86);
		double conversao = calculaConversao("GBP", "USD");
		

		System.out.println(conversao);
	}
	
	

	private static void adicionaConversao(String moeda1, String moeda2, double conversao) {
		if (!moedas.containsKey(moeda1)) {
			moedas.put(moeda1, new Moeda(moeda1));
		}
		if (!moedas.containsKey(moeda2)) {
			moedas.put(moeda2, new Moeda(moeda2));
		}
		Moeda m1 = moedas.get(moeda1);
		Moeda m2 = moedas.get(moeda2);

		m1.adicionaConversao(m2, conversao);
		m2.adicionaConversao(m1, 1/conversao);
	}

	private static double calculaConversao(String moeda1, String moeda2) {
		return calculaConversao(moeda1, moeda2, false);
	}

	private static double calculaConversao(String moeda1, String moeda2, boolean verboso) {
		
		if (!moedas.containsKey(moeda1) || !moedas.containsKey(moeda2)) {
			throw new IllegalArgumentException("Moeda não cadastrada");
		}

		return moedas.get(moeda1).calculaConversao(moeda2, verboso);
	}
}
