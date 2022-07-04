package br.com.letscode.Exercicios.Classes;

import java.math.BigDecimal;

public class Questao3 {
	public static class Conta {
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

		public int getNumero() {
			return this.numero;
		}

		public void depositar(double deposito) {
			System.out.println(this.titular + " botou " + deposito);
			saldo = saldo.add(BigDecimal.valueOf(deposito));
		}
	}
}
