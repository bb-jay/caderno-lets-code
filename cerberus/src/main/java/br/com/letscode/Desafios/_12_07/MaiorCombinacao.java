package br.com.letscode.Desafios._12_07;

public class MaiorCombinacao {
	public static void main(String[] args) {
		
		int[] lista1 = {15,30,100,50,23};
		System.out.println(maximoCombinacoes(lista1, 3));
		
		int[] lista2 = {1000,1,500,600,100};
		System.out.println(maximoCombinacoes(lista2, 2));
		
		int[] lista3 = {1000,1,500,600,100};
		System.out.println(maximoCombinacoes(lista3, 10));
	}

	public static int maximoCombinacoes(int[] lista, int numero) {
		
		if (lista.length < numero) {
			return -1;
		}

		int soma = 0;

		//primeira soma
		for (int i = 0; i < numero; i++) {
			soma += lista[i];
		}

		int maior = soma;

		for (int i = numero; i < lista.length; i++) {
			soma += lista[i];
			soma -= lista[i - numero];
			if (soma > maior) maior = soma;
		}

		return maior;
	}
}
