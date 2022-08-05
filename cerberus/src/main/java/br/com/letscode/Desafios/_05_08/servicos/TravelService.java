package br.com.letscode.Desafios._05_08.servicos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import br.com.letscode.Desafios._05_08.modelos.Cidade;
import br.com.letscode.Desafios._05_08.modelos.RedeDeVoos;

public class TravelService implements Travel {

	private RedeDeVoos rede;

	public TravelService(RedeDeVoos rede) {
		this.rede = rede;
	}

	@Override
	public boolean isReachable(String de, String para, int maxConexoes) {

		if (!rede.getCidades().contains(new Cidade(de)) ||
				!rede.getCidades().contains(new Cidade(para)))
			return false;

		Cidade origem = rede.getCidade(de).get();
		List<Cidade> pilha = new LinkedList<>();
		pilha.add(origem);

		Set<Cidade> queimadas = new HashSet<>();

		return procuraCaminho(origem, para.toUpperCase(), maxConexoes, pilha, queimadas);	
	}

	private boolean procuraCaminho(Cidade origem, String destino, int numeroDeConexoes, List<Cidade> pilha, Set<Cidade> queimadas) {

		if (origem.getDestinos()
				.stream()
				.filter(parada -> parada.getNome().equals(destino))
				.findAny()
				.isPresent())
			return true;

		if (pilha.size() > numeroDeConexoes) 
			return false;

		for (Cidade parada : origem.getDestinos()) {
			if (queimadas.contains(parada) || pilha.contains(parada))
				continue;
			pilha.add(parada);
			if (procuraCaminho(parada, destino, numeroDeConexoes, pilha, queimadas))
				return true;
			pilha.remove(parada);
		}

		queimadas.add(origem);
		return false;

	}

}
