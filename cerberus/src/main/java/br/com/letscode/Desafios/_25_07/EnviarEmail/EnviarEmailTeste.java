package br.com.letscode.Desafios._25_07.EnviarEmail;

public class EnviarEmailTeste {
	public static void main(String[] args) {
		Email email = new Email();
		email.setDe("gustavo.jay@bb.com.br");
		email.setPara("email@example.com");
		email.setAssunto("Meu formatador de e-mail");
		email.setTexto("Olá! Fiz um formatador de e-mail. O caçador é um ímã para presas. Não fique em seu caminho!");
		
		email.tirarAcentos();
		System.out.println(email.getTexto());
		System.out.println();
		
		email.paraMaiusculas();
		System.out.println(email.getTexto());
		System.out.println();
		
		email.paraMinusculas();
		System.out.println(email.getTexto());
		System.out.println();
		
		email.paraCamelCase();
		System.out.println(email.getTexto());
		System.out.println();
		
		email.restaurar();
		System.out.println(email.getTexto());
		System.out.println();
		
		email.paraCamelCase();
		System.out.println(email.getTexto());
		System.out.println();

		email.enviar();
		System.out.println(email);

		email.enviar();
	}
}
