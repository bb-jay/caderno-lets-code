package br.com.letscode.Exercicios.Metodos;

public class Questao2 {
	private static class Funcionario {
		private double salario;

		public Funcionario (double salarioInicial) {
			this.salario = salarioInicial;
		}

		public void darBonus(double porcentagem) {
			this.salario += this.salario * porcentagem / 100;
		}

		public double getSalario() {
			return this.salario;
		}
	}
	public static void main(String[] args) {
		Funcionario jose = new Funcionario(2500);

		System.out.println(jose.getSalario());

		System.out.println("Aplicando bônus...");
		jose.darBonus(10);

		System.out.println(jose.getSalario());
	}
}
