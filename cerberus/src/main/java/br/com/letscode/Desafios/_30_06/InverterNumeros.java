package br.com.letscode.Desafios._30_06;

public class InverterNumeros {
	public static void main(String[] args) {
		System.out.println(inverter(123456));
		System.out.println(inverter(90056));
		System.out.println(inverter(120056));
		System.out.println(inverter(126003));
		System.out.println(inverter(1665165));
	}
	public static int inverter(int numero) {
		
		char[] numeroCharArray = String.valueOf(numero).toCharArray();
		int tamanho = numeroCharArray.length;
		
		char[] invertidoCharArray = new char[tamanho];
		for (int i = 1; i <= tamanho; i++) {
			invertidoCharArray[tamanho - i] = numeroCharArray[i - 1];
		}
		
		return Integer.valueOf(String.valueOf(invertidoCharArray));

	}
}
