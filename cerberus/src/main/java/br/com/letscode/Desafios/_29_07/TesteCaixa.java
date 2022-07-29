package br.com.letscode.Desafios._29_07;

import java.util.ArrayList;
import java.util.List;

public class TesteCaixa {
	public static void main(String[] args) {

		List<Item> carrinho = new ArrayList<>();
		Caixa caixa = new Caixa(carrinho);

		carrinho.add(new Item("Nescau", 800));
		carrinho.add(new Item("Biscoito", 180));
		carrinho.add(new Item("Café", 900));
		carrinho.add(new Item("Picanha", 6000));
		carrinho.add(new Item("Fraldas", 2400));
		carrinho.add(new Item("Feijão", 750));

		System.out.printf("%d itens no carrinho%nDESCONTO DE %d %%!%nR$ %.2f%n",
				carrinho.size(),
				(int) (caixa.calculaDesconto() * 100),
				caixa.valorDaConta());
		System.out.println();

		carrinho.add(new Item("Nescau", 800));
		carrinho.add(new Item("Biscoito", 180));
		carrinho.add(new Item("Café", 900));
		carrinho.add(new Item("Picanha", 6000));
		carrinho.add(new Item("Fraldas", 2400));

		System.out.printf("%d itens no carrinho%nDESCONTO DE %d %%!%nR$ %.2f%n",
				carrinho.size(),
				(int) (caixa.calculaDesconto() * 100),
				caixa.valorDaConta());
		System.out.println();
	}
}
