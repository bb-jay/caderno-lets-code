package br.com.letscode.Desafios._10_08.AgendaDeEventos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DesafioAgenda {

	public static final ZoneId SP_ID = ZoneId.of("America/Sao_Paulo");
	public static final ZoneId PA_ID = ZoneId.of("Europe/Paris");

	public static void main(String[] args) {
		ZonedDateTime inicioDoEventoEmSP = ZonedDateTime.of(
				LocalDateTime.of(
						2022,
						07,
						20,
						10,
						00),
				SP_ID);
		ZonedDateTime inicioDoEventoEmParis = inicioDoEventoEmSP.withZoneSameInstant(PA_ID);

		Agenda agendaSP = new Agenda("São Paulo");
		Agenda agendaPA = new Agenda("Paris");

		AgendaService service = new AgendaService();

		service.agendarSessoes(agendaSP, 10, inicioDoEventoEmSP);
		service.agendarSessoes(agendaPA, 10, inicioDoEventoEmParis);

		service.imprimeSessoes(agendaSP);
		service.imprimeSessoes(agendaPA);
	}

}