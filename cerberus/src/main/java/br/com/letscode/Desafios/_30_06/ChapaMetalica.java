package br.com.letscode.Desafios._30_06;

import java.util.Scanner;

public class ChapaMetalica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		questao1();
		questao2(sc);
		questao3(sc);
		sc.close();
	}

	public static void questao1() {
		// Rodando a simulação
		System.out.println("Questão 1:");
		double[][] resultado = equilibrioTermico(20, 20, 100, -3, 5, 6, ERRO_PADRAO, ITER_PADRAO);
		imprimeResultado(resultado);
		System.out.println();
	}

	public static void questao2(Scanner sc) {

		System.out.println("Questão 2:");
		System.out.print("Qual o erro desejado? ");
		double erro = Double.parseDouble(sc.nextLine());
		System.out.print("Qual o número máximo de iterações? ");
		int iter = Integer.parseInt(sc.nextLine());

		double[][] resultado = equilibrioTermico(20, 20, 100, -3, 5, 6, erro, iter);
		imprimeResultado(resultado);
		System.out.println();
	}

	public static void questao3(Scanner sc) {
		
		System.out.println("Questão 3:");
		System.out.print("Qual o erro desejado? ");
		double erro = Double.parseDouble(sc.nextLine());
		System.out.print("Qual o número máximo de iterações? ");
		int iter = Integer.parseInt(sc.nextLine());
		System.out.print("Quantas casas mostrar no resultado? ");
		int prec = Integer.parseInt(sc.nextLine());

		double[][] resultado = equilibrioTermico(20, 20, 100, -3, 5, 6, erro, iter);
		imprimeResultado(resultado, prec);
		System.out.println();
	}

	final static double ERRO_PADRAO = 1e-1;
	final static int TAMANHO_PADRAO = 11;
	final static int ITER_PADRAO = 10000000;
	private static double[][] chapa;

	public static double[][] equilibrioTermico(double tempCima, double tempBaixo, double tempEsq, double tempDir,
			int tamX, int tamY, double erro, int iterMax) {
		inicializaChapa(tempCima, tempBaixo, tempEsq, tempDir, tamX, tamY);

		boolean variando = true;
		int iter = 0;

		while (variando && iter < iterMax) {

			variando = false;
			double[][] chapaInicio = new double[chapa.length][chapa[0].length];
			for (int i = 0; i < chapaInicio.length; i++)
				chapaInicio[i] = chapa[i].clone();

			for (int i = 1; i < chapa.length - 1; i++) {
				for (int j = 1; j < chapa[i].length - 1; j++) {
					chapa[i][j] = (chapaInicio[i + 1][j] + chapaInicio[i - 1][j] + chapaInicio[i][j + 1] + chapaInicio[i][j - 1])
							/ 4;
					if (chapa[i][j] - chapaInicio[i][j] > erro)
						variando = true;
				}
			}
			iter++;
		}
		System.out.println("Simulação finalizada após " + iter + " iterações.");
		return chapa;
	}

	private static void inicializaChapa(double tempCima, double tempBaixo, double tempEsq, double tempDir, int tamX,
			int tamY) {
		chapa = new double[tamY][tamX];
		for (int i = 0; i < chapa.length; i++) {
			chapa[i][0] = tempEsq;
			chapa[i][tamX - 1] = tempDir;
		}
		for (int j = 1; j < chapa[0].length - 1; j++) {
			chapa[0][j] = tempCima;
			chapa[tamY - 1][j] = tempBaixo;
		}
	}

	private static void imprimeResultado(double[][] resultado) {
		imprimeResultado(resultado, 2);
	}

	private static void imprimeResultado(double[][] resultado, int precisao) {
		for (double[] linha : resultado) {
			System.out.println();
			for (double valor : linha) {
				System.out.printf("%." + precisao + "f  ", valor);
			}
		}
	}

}
