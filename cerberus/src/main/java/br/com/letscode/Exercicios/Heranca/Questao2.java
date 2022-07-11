package br.com.letscode.Exercicios.Heranca;

public class Questao2 {
	public static class Funcionario {
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
			return this.salario * 3;
		}

		public double calcularFerias() {
			return this.salario * 0.3;
		}
	}

	public static class Gerente extends Funcionario {
		Gerente(String nome, int matricula) {
			super(nome, matricula, 8000);
		}
		@Override
		public double calcularPlr() {
			return super.getSalario() * 4;
		}
	}

	public static class Estagiario extends Funcionario {
		Estagiario(String nome, int matricula) {
			super(nome, matricula, 1500);
		}
		@Override
		public double calcularPlr() {
			return super.getSalario() * 2;
		}
	}

	public static void main(String[] args) {
		Funcionario joao = new Estagiario("João", 123);
		Funcionario valdisney = new Gerente("Valdisney", 456);
		Funcionario generico = new Funcionario("Genérico", 789, 4000);
		System.out.println(joao.calcularPlr());
		System.out.println(valdisney.calcularPlr());
		System.out.println(generico.calcularPlr());
	}
}
