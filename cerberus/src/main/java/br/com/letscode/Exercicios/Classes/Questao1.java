package br.com.letscode.Exercicios.Classes;

import java.time.LocalDate;
import java.util.Scanner;

public class Questao1 {

	public static class CartaoDeCredito {
		private final int numero;
		private final LocalDate validade;
		private int senha;
		private final Scanner sc;

		CartaoDeCredito(int numero, LocalDate validade, Scanner sc, int senha) {
			this.numero = numero;
			this.validade = validade;
			this.senha = senha;
			this.sc = sc;
		}

		public void setSenha() {
			int novaSenha;
			int verificacao;

			if (validaSenha()) {
				try {
					System.out.println("Nova senha...");
					novaSenha = Integer.parseInt(sc.nextLine());

					System.out.println("Digite novamente...");
					verificacao = Integer.parseInt(sc.nextLine());

					if (novaSenha == verificacao) {
						senha = novaSenha;
						System.out.println("Alterada com sucesso!");
					} 
					else {
						System.out.println("As senhas não batem, cancelando...");
					}
				}

				catch (Exception e) {
					System.out.println("Erro: " + e);
					return;
				}
			}
		}

		private boolean validaSenha() {
			int senhaDigitada;
			System.out.print("Insira sua senha... ");
			try {
				senhaDigitada = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Senha inválida");
				return false;
			}

			if (senhaDigitada == senha) {
				System.out.println("Senha correta. Entrando...");
				return true;
			} else {
				System.out.println("Senha errada...");
				return false;
			}

		}

		public boolean estaValido() {
			return LocalDate.now().isBefore(validade);
		}

		public void mostraNumero() {
			if (validaSenha())
				System.out.println(numero);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CartaoDeCredito cartao = new CartaoDeCredito(123456789, LocalDate.parse("2025-01-01"), sc, 12345);
		CartaoDeCredito cartaoVencido = new CartaoDeCredito(987654321, LocalDate.parse("2020-01-01"), sc, 56497);


		cartao.mostraNumero();
		System.out.println(cartao.estaValido());

		cartaoVencido.mostraNumero();
		System.out.println(cartaoVencido.estaValido());

		cartao.setSenha();

		cartao.mostraNumero();

	}
}
