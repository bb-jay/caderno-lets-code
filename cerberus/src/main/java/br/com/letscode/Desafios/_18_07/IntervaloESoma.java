package br.com.letscode.Desafios._18_07;

public class IntervaloESoma {
	private static void intervaloESoma(int a, int b) {
		
		int menor, maior;
		if (a < b) {
			menor = a;
			maior = b;
		} else {
			menor = b;
			maior = a;
		}

		int soma = 0;
		String saida = "Números: ";
		for (int i = menor; i <= maior; i++) {
			soma += i;
			saida += i + ", ";
		}

		saida += "Soma: " + soma;
		System.out.println(saida);
	}

	public static void main(String[] args) {
		intervaloESoma(2,6);
		intervaloESoma(12,1);
	}
}
