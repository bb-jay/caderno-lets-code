package br.com.letscode.Exercicios.Encapsulamento;

public class Questao1 {
	public static final class Calculadora{
		public static double somar(double a, double b) {
			return a + b;
		}

		public static double somar(double[] numeros) {
			double soma = 0;
			for (double num: numeros){
				soma = somar(soma, num);
			}
			return soma;
		}
		
		public static double multiplicar(double a, double b) {
			return a * b;
		}
		
		public static double multiplicar(double[] numeros) {
			double produto = 1;
			for (double num: numeros){
				produto = multiplicar(produto, num);
			}
			return produto;

		}

		public static double subtrair(double a, double b) {
			return a - b;
		}

		public static double dividir(double a, double b) {
			return a / b;
		}
	}
	public static void main(String[] args) {
		double[] lista = {1,3,5.0,3.68};
		System.out.println(Calculadora.somar(3, 4));
		System.out.println(Calculadora.somar(-7.4, 8.9));
		System.out.println(Calculadora.somar(lista));
		System.out.println(Calculadora.multiplicar(3, 4));
		System.out.println(Calculadora.multiplicar(-9.6, 4));
		System.out.println(Calculadora.multiplicar(lista));
		System.out.println(Calculadora.subtrair(3,4));
		System.out.println(Calculadora.subtrair(-3.2,-4.5));
		System.out.println(Calculadora.dividir(1,2));
		System.out.println(Calculadora.dividir(5,-9));
		System.out.println(Calculadora.dividir(3, 0));
	}

}
