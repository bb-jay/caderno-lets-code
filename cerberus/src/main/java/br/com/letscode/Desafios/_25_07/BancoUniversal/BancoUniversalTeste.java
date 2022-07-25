package br.com.letscode.Desafios._25_07.BancoUniversal;

import br.com.letscode.Desafios._25_07.BancoUniversal.Cliente.ClienteArrojado;
import br.com.letscode.Desafios._25_07.BancoUniversal.Cliente.ClienteConservador;
import br.com.letscode.Desafios._25_07.BancoUniversal.Investimento.Acao;
import br.com.letscode.Desafios._25_07.BancoUniversal.Investimento.CDB;
import br.com.letscode.Desafios._25_07.BancoUniversal.Investimento.FundoImobiliario;
import br.com.letscode.Desafios._25_07.BancoUniversal.Investimento.Investimento;
import br.com.letscode.Desafios._25_07.BancoUniversal.Investimento.Tesouro;

public class BancoUniversalTeste {
	public static void main(String[] args) {
		var conservador = new ClienteConservador();
		// método contratarInvestimento adiciona na lista de investimentos do cliente
		conservador.contratarInvestimento(new CDB());
		conservador.contratarInvestimento(new Tesouro());
		// conservador.contratarInvestimento(new Acao());// ERRO de compilação
		for (Investimento i : conservador.getCarteiraInvestimentos()) {
			System.out.println(i);
		}

		var arrojado = new ClienteArrojado();
		arrojado.contratarInvestimento(new Acao());
		arrojado.contratarInvestimento(new FundoImobiliario());

		// arrojado.contratarInvestimento(new Tesouro());// ERRO de compilação
		for (Investimento i : arrojado.getCarteiraInvestimentos()) {
			System.out.println(i);
		}
	}
}
