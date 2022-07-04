package br.com.letscode.Exercicios.Classes;

import br.com.letscode.Exercicios.Classes.Questao3.Conta;
import java.util.HashMap;

public class Questao2 {
	public static class Agencia {
		private HashMap<Integer, Conta> contas;
		private HashMap<Integer, Funcionario> funcionarios;
		private final int numero;

		public Agencia(int numero) {
			this.numero = numero;
			this.contas = new HashMap<Integer, Conta>();
			this.funcionarios = new HashMap<Integer, Funcionario>();
		}

		public void botaConta(Conta conta) {
			contas.put(conta.getNumero(), conta);
		}

		public Conta pegaConta(int numero) {
			return contas.get(numero);
		}

		public void botaFuncionario(Funcionario funcionario) {
			funcionarios.put(funcionario.matricula, funcionario);
		}

		public Funcionario pegaFuncionario(int matricula) {
			return funcionarios.get(matricula);
		}

		public int getNumero() {
			return this.numero;
		}
	}
	private static class Funcionario {
		public int matricula;
	}
}
