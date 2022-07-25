package br.com.letscode.Desafios._25_07.BancoUniversal.Cliente;

import br.com.letscode.Desafios._25_07.BancoUniversal.Investimento.RendaVariavel;
import br.com.letscode.Desafios._25_07.BancoUniversal.PerfilCliente.Arrojado;
import br.com.letscode.Desafios._25_07.BancoUniversal.PerfilCliente.PerfilCliente;

public class ClienteArrojado extends Cliente {
	PerfilCliente perfil = new Arrojado();
	
	public void contratarInvestimento(RendaVariavel investimento) {
		super.adicionarInvestimento(investimento);
	}
}
