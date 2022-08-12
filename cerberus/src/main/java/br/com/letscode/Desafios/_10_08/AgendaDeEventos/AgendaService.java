package br.com.letscode.Desafios._10_08.AgendaDeEventos;

import java.time.ZonedDateTime;

public class AgendaService {
	public void agendarSessoes(Agenda agenda, int numSessoes, ZonedDateTime dataInicial) {
		agenda.limpar();
		for (int i = 0; i < numSessoes; i++) {
			agenda.marcaSessao(new Sessao(
					dataInicial
							.plusHours(2 * i)
							.plusDays(numSessoes * i),
					i + 1));
		}
	}

	public void imprimeSessoes(Agenda agenda) {
		System.out.println(agenda.getLocal());
		for (Sessao sessao : agenda.getSessoes()) {
			System.out.println(sessao);
		}
	}
}
