package br.com.letscode.Desafios._10_08.AgendaDeEventos;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Sessao {

	public static final DateTimeFormatter formatoCompleto = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm");
	public static final DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("ccc dd/MM/yyyy");
	public static final DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
	private ZonedDateTime dataEHoraInicio;
	private ZonedDateTime dataEHoraFim;
	private int numero;

	Sessao(ZonedDateTime dataEHora, int numero) {
		this.dataEHoraInicio = dataEHora;
		this.dataEHoraFim = dataEHora.plusHours(6);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public ZonedDateTime getDataEHora() {
		return dataEHoraInicio;
	}

	@Override
	public String toString() {
		return String.format(
				"Sessão %2d: %s, %s a %s",
				numero,
				dataEHoraInicio.format(formatoData),
				dataEHoraInicio.format(formatoHora),
				dataEHoraFim.format(formatoHora));
	}
}