package br.com.letscode.Aulas._11_07;

public class Excecoes {

	public static class UserNotFound extends RuntimeException {
    UserNotFound(String s) {super(s);}
  }
  
  public static class InvalidUserException extends RuntimeException {
    InvalidUserException(String s) {super(s);}
  }

  public static void login(String usuario, String senha) {
    if (usuario.length() < 4) {
      throw new InvalidUserException("Usuario deve ter mais que 3 caracteres");
    }
    if (senha.length() < 4) {
      throw new InvalidUserException("Senha deve ter mais que 3 caracteres");
    }
    if (!usuario.equalsIgnoreCase("ADMIN") || !senha.equals("123456789")) {
      throw new UserNotFound("Credenciais incorretas");
		}
    System.out.println("Usuário logado com sucesso!");
  }

  public static void main(String[] args) {
    String usuario = "ADmin";
    String senha = "123456789";

    try {
      login(usuario, senha);
    } catch (InvalidUserException | UserNotFound e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Até logo!");
    }
  }
}
