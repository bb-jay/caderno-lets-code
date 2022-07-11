package br.com.letscode.Exercicios.Heranca;

public class Questao1 {
	public static abstract class Funcionario {
		private final String nome;
		private final int matricula;
		private double salario;

		Funcionario(String nome, int matricula, double salario) {
			this.nome = nome;
			this.matricula = matricula;
			this.salario = salario;
		}

		public int getMatricula() {
			return matricula;
		}

		public double getSalario() {
			return salario;
		}

		public String getNone() {
			return nome;
		}

		public double calcularPlr() {
			if (salario < 4000)
				return this.salario * 1.2;
			return this.salario * 0.8;
		}

		public double calcularFerias() {
			return this.salario * 0.3;
		}
	}

	public static class Gerente extends Funcionario {
		Gerente(String nome, int matricula) {
			super(nome, matricula, 8000);
		}
	}

	public static class Estagiario extends Funcionario {
		Estagiario(String nome, int matricula) {
			super(nome, matricula, 1500);
		}
	}

	public static void main(String[] args) {
		Funcionario joao = new Estagiario("João", 123);
		Funcionario valdisney = new Gerente("Valdisney", 456);
		System.out.println(joao.calcularPlr());
		System.out.println(joao.calcularFerias());
		System.out.println(valdisney.calcularPlr());
		System.out.println(valdisney.calcularFerias());
	}
}
