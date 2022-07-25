package br.com.letscode.Desafios._25_07.BancoUniversal.Cliente;

import br.com.letscode.Desafios._25_07.BancoUniversal.Investimento.RendaFixa;
import br.com.letscode.Desafios._25_07.BancoUniversal.PerfilCliente.Conservador;
import br.com.letscode.Desafios._25_07.BancoUniversal.PerfilCliente.PerfilCliente;

public class ClienteConservador extends Cliente {
	PerfilCliente perfil = new Conservador();

	public void contratarInvestimento(RendaFixa investimento) {
		super.adicionarInvestimento(investimento);
	}
}
