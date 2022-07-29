package br.com.letscode.Desafios._29_07;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Caixa {

	private List<Item> carrinho;
	private static final Map<Integer, Double> descontos = new LinkedHashMap<>();
	{
		// A partir de {KEY} recebe {VALUE} de desconto (em decimal)
		descontos.put(5, 0.05);
		descontos.put(10, 0.08);
		descontos.put(15, 0.10);
	}

	Caixa(List<Item> carrinho) {
		this.carrinho = carrinho;
	}

	public Double calculaDesconto() {
		int qtdItensNoCarrinho = carrinho.size();
		List<Entry<Integer, Double>> descontosEmOrdemDescrescente = descontos
				.entrySet()
				.stream()
				.sorted((d1, d2) -> Integer.compare(d2.getKey(), d1.getKey()))
				.collect(Collectors.toList());

		for (Entry<Integer, Double> desconto : descontosEmOrdemDescrescente) {
			if (qtdItensNoCarrinho >= desconto.getKey()) {
				return desconto.getValue();
			}
		}
		return 0.0;
	}

	public BigDecimal valorDaConta() {
		long precoSemDesconto = carrinho
		.stream()
		.mapToLong(Item::getPreco)
		.sum();

		long precoComDesconto = (long) (precoSemDesconto * (1 - calculaDesconto()));
		return BigDecimal.valueOf(precoComDesconto, 2);
	}
}