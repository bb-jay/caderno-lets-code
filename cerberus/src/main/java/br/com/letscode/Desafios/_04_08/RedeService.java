package br.com.letscode.Desafios._04_08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class RedeService {

	private Rede rede;

	RedeService(Rede rede) {
		this.rede = rede;
	}

	public boolean redeConectada() {
		Collection<No> queimados = new ArrayList<>();
		if (rede.getNos().size() < 2)
			return true;
		No primeiroNo = rede.getNos().stream().findFirst().get();
		propaga(primeiroNo, queimados);
		return queimados.size() == rede.getNos().size();
	}

	private void propaga(No origem, Collection<No> queimados) {
		queimados.add(origem);
		for (No outroNo : origem.getVizinhos()) {
			if (queimados.contains(outroNo))
				continue;
			propaga(outroNo, queimados);
		}
	}

	public boolean ehCritica(Conexao conexao) {
		rede.removeConexao(conexao.getNo1().getNumero(), conexao.getNo2().getNumero());
		boolean conectada = redeConectada();
		rede.adicionaConexao(conexao.getNo1().getNumero(), conexao.getNo2().getNumero());
		return !conectada;
	}

	public Collection<Conexao> conexoesCriticas() {
		
		if (!redeConectada()) {
			throw new IllegalStateException("Rede não é conectada.");
		}
		
		Collection<Conexao> criticas = new HashSet<>();

		//Tem que separar a coleção da função da coleção que tem dentro da rede.
		List<Conexao> conexoesIsoladas = new ArrayList<>(rede.getConexoes());

		for (Conexao con: conexoesIsoladas) {
			if (ehCritica(con)) {
				criticas.add(con);
			}
		}
		return criticas;
	}
}
