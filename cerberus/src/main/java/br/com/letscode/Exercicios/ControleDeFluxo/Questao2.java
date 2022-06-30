package br.com.letscode.Exercicios.ControleDeFluxo;

public class Questao2 {
	public static void main(String[] args) {
		accountType("PERSONAL");
		accountType("Personal");
		accountType("BUSINESS");
		accountType("BUsInesS");
		accountType("banana");
		accountType("chuveiro");
	}

	public static void accountType (String accountType) {
		
		accountType = accountType.toUpperCase();

		switch(accountType) {
			case "PERSONAL":
				System.out.println("Conta pessoal");
				break;
			case "BUSINESS":
				System.out.println("Conta empresarial");
				break;
			default:
				System.out.println("Tipo de conta não existente");
		}

	}
}
