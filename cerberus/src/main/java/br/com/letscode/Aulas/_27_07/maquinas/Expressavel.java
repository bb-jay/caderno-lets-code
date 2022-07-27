package br.com.letscode.Aulas._27_07.maquinas;

public interface Expressavel {
	
	public void tirarExpresso();
	
	public default void expressar(int senha) {
		if (senha == 123456) {
			System.out.println("SER OU NÃO SER???");
		}
	}
}
