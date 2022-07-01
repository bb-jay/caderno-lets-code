package br.com.letscode.Desafios._30_06;

public class NumeroDeTerrenos {

	public static void main(String[] args) {
		int[][] terrenos = {
				{ 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 0, 1 },
				{ 0, 0, 0, 1, 1 },
				{ 1, 0, 1, 0, 0 },
		};
		System.out.println(calculaPropriedades(terrenos));
	}

	private static int[][] terrenos;

	public static int calculaPropriedades(int[][] terrenosEntrada) {
		terrenos = terrenosEntrada;

		int propriedades = 0;

		for (int i = 0; i < terrenos.length; i++) {
			for (int j = 0; j < terrenos[i].length; j++) {
				if (terrenos[i][j] == 1) {
					// Funda-se uma nova propriedade
					int propriedade = i * terrenos[i].length + j;
					propaga(i, j, propriedade);
					propriedades++;
				}
			}
		}

		terrenos = null;
		return propriedades;
	}

	private static void propaga(int i, int j, int propriedade) {

		terrenos[i][j] = propriedade;

		if (i != 0 && terrenos[i - 1][j] == 1)
			propaga(i - 1, j, propriedade);

		if (j != 0 && terrenos[i][j - 1] == 1)
			propaga(i, j - 1, propriedade);

		if (i != terrenos.length - 1 && terrenos[i + 1][j] == 1)
			propaga(i + 1, j, propriedade);

		if (j != terrenos[i].length - 1 && terrenos[i][j + 1] == 1)
			propaga(i, j + 1, propriedade);
	}
	/*
	 * 
	 * private static void calculaPropriedadesOld(int[][] terrenosEntrada) {
	 * 
	 * terrenos = terrenosEntrada;
	 * 
	 * for (int i = 0; i < terrenos.length; i++) {
	 * for (int j = 0; j < terrenos[i].length; j++) {
	 * 
	 * if (terrenos[i][j] == 1) {
	 * 
	 * int deCima = 0;
	 * int deTras = 0;
	 * 
	 * // Olhando o vizinho de cima
	 * if (i != 0)
	 * deCima = terrenos[i - 1][j];
	 * 
	 * // Olhando o vizinho de trás
	 * if (j != 0)
	 * deTras = terrenos[i][j - 1];
	 * 
	 * if (deCima == deTras) {
	 * // Se ambos são zero, é uma nova propriedade. Se não, ele fica igual os pais
	 * terrenos[i][j] = deCima == 0 ? i * terrenos.length + j : deCima;
	 * } else if (deCima == 0 || deTras == 0) {
	 * // Se um deles for zero, pegar o valor do outro
	 * terrenos[i][j] = deCima + deTras;
	 * } else {
	 * // Se cada um for de um jeito, misturou propriedades
	 * // A FAZER
	 * }
	 * }
	 * }
	 * }
	 * terrenos = null;
	 * }
	 */

}
