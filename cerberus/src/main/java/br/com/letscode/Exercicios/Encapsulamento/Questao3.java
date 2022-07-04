package br.com.letscode.Exercicios.Encapsulamento;

import java.math.BigDecimal;

public class Questao3 {

	private static class Conta {
		private final int numero;
		private final String titular;
		private BigDecimal saldo;

		public Conta(int numero, String titular) {
			this.numero = numero;
			this.titular = titular;
			this.saldo = new BigDecimal("0.00");
		}

		public double sacar(double saque) {
			if (saque < saldo.doubleValue()) {
				saldo = saldo.subtract(BigDecimal.valueOf(saque));
				System.out.println("toma " + saque + " conto, " + this.titular);
				return saque;
			} else {
				System.out.println("Sem grana, " + this.titular);
				return 0;
			}
		}

		public void depositar(double deposito) {
			System.out.println(this.titular + " botou " + deposito);
			saldo = saldo.add(BigDecimal.valueOf(deposito));
		}
	}

	public static void main(String[] args) {
		Conta ze = new Conta(123, "Zé");
		Conta maria = new Conta(321, "Maria");

		ze.depositar(500);
		maria.depositar(ze.sacar(300));
		maria.sacar(200);
		maria.sacar(200);
	}
}
