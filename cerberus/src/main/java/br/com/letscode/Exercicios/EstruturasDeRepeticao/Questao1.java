package br.com.letscode.Exercicios.EstruturasDeRepeticao;

public class Questao1 {
	public static void main(String[] args) {
		sumEvenNumbers(2, 5);
		sumEvenNumbers(3, 4);
		sumEvenNumbers(1, 9);
	}

	public static void sumEvenNumbers (int start, int end) {
		
		int soma = 0;
		
		if (start % 2 != 0) {
			start += 1;
		}

		for (int i = start; i <= end; i += 2) {
			soma += i;
		}

		System.out.println(soma);
	}


}
