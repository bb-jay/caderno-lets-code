package br.com.letscode.Desafios._25_07.BancoUniversal.Cliente;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import br.com.letscode.Desafios._25_07.BancoUniversal.Investimento.Investimento;

public abstract class Cliente {
	protected final Collection<Investimento> investimentos = new LinkedList<>();

	public Collection<Investimento> getCarteiraInvestimentos() {
		return Collections.unmodifiableCollection(this.investimentos);
	}

	protected void adicionarInvestimento(Investimento investimento) {
		this.investimentos.add(investimento);
	}
}
