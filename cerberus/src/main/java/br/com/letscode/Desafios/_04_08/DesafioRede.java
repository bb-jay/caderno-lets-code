package br.com.letscode.Desafios._04_08;

public class DesafioRede {
	public static void main(String[] args) {
		Rede rede = new Rede();
		RedeService service = new RedeService(rede);

		//Parte 1
		rede.adicionaConexao(1, 2);
		rede.adicionaConexao(2, 0);
		rede.adicionaConexao(0, 1);
		rede.adicionaConexao(1, 3);

		System.out.println(service.conexoesCriticas());

		//Parte 2
		rede.adicionaConexao(3, 4);
		rede.adicionaConexao(3, 5);
		rede.adicionaConexao(4, 5);

		System.out.println(service.conexoesCriticas());
		
		//Parte 3
		rede.adicionaConexao(5, 6);
		rede.adicionaConexao(6, 7);
		rede.adicionaConexao(6, 8);
		rede.adicionaConexao(6, 9);
		rede.adicionaConexao(7, 8);
		rede.adicionaConexao(7, 9);
		rede.adicionaConexao(8, 9);
		
		System.out.println(service.conexoesCriticas());

		//Parte 4
		rede.adicionaConexao(7, 0);
		
		System.out.println(service.conexoesCriticas());
	}
}
