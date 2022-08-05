package br.com.letscode.Desafios._05_08;

import br.com.letscode.Desafios._05_08.modelos.RedeDeVoos;
import br.com.letscode.Desafios._05_08.servicos.Travel;
import br.com.letscode.Desafios._05_08.servicos.TravelService;

public class DesafioVoo {
	public static void main(String[] args) {
		RedeDeVoos rede = new RedeDeVoos();
		Travel travel = new TravelService(rede);

		rede.adicionaDestino("POA", "BSB");
		rede.adicionaDestino("GRU", "POA");
		rede.adicionaDestino("BSB", "NAT");
		rede.adicionaDestino("BSB", "GRU");
		rede.adicionaDestino("GRU", "BSB");
		rede.adicionaDestino("GRU", "NAT");
		rede.adicionaDestino("BSB", "SSA");
		rede.adicionaDestino("SSA", "NAT");
		rede.adicionaDestino("GRU", "REC");
		rede.adicionaDestino("SSA", "REC");
		rede.adicionaDestino("SDU", "SSA");
		rede.adicionaDestino("VCP", "SSA");

		boolean teste1 = travel.isReachable("GRU", "REC", 0);
		boolean teste2 = !travel.isReachable("POA", "REC", 1);
		boolean teste3 = !travel.isReachable("POA", "NAT", 0);
		boolean teste4 = travel.isReachable("POA", "REC", 100);
		boolean teste5 = !travel.isReachable("SDU", "BSB", 100);
		boolean teste6 = !travel.isReachable("GRU", "VCP", 1000);

		System.out.println(teste1 ? "Passou!" : "Falhou!");
		System.out.println(teste2 ? "Passou!" : "Falhou!");
		System.out.println(teste3 ? "Passou!" : "Falhou!");
		System.out.println(teste4 ? "Passou!" : "Falhou!");
		System.out.println(teste5 ? "Passou!" : "Falhou!");
		System.out.println(teste6 ? "Passou!" : "Falhou!");

	}
}
