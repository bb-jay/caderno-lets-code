package br.com.letscode.Desafios._10_08.AgendaDeEventos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {
	private List<Sessao> sessoes = new ArrayList<>();
	private String local;

	Agenda(String local) {
		this.local = local;
	}

	public String getLocal() {
		return local;
	}

	public List<Sessao> getSessoes() {
		return Collections.unmodifiableList(sessoes);
	}

	public void limpar() {
		this.sessoes = new ArrayList<>();
	}

	public void marcaSessao(Sessao sessao) {
		this.sessoes.add(sessao);
	}
}