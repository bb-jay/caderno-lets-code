package br.com.letscode.Desafios._30_06;

public class AcheMaiorString {
	public static void main(String[] args) {
		String[] strings = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};
		System.out.println(maiorSequencia(strings));

		System.out.println();
		for (String str: strings) System.out.println(maiorSequencia(str));
	}

	private static String maiorSequencia(String str) {

		int inicioDefinitivo = 0;
		int fimDefinitivo = 0;
		int tamanho = 0;

		int inicioAtual = 0;
		int comparador = 0;
		int fimAtual = 1;

		while (fimAtual < str.length()) {
			
			while (fimAtual < str.length() && str.charAt(comparador) < str.charAt(fimAtual)) {
				comparador++;
				fimAtual++;
			}

			if ((fimAtual - inicioAtual) > tamanho) {
				inicioDefinitivo = inicioAtual;
				fimDefinitivo = fimAtual;
				tamanho = fimAtual - inicioAtual;
			}
			inicioAtual = fimAtual;
			comparador = fimAtual;
			fimAtual++;
		}

		return str.substring(inicioDefinitivo, fimDefinitivo);

	}

	private static String maiorSequencia(String[] strs) {
		String maior = "";
		for (String str : strs) {
			String daVez = maiorSequencia(str);
			if (daVez.length() > maior.length())
				maior = daVez;
		}
		return maior;
	}

}
