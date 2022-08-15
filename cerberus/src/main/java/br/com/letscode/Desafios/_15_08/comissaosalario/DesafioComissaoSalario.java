package br.com.letscode.Desafios._15_08.comissaosalario;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedHashMap;
import java.util.Map;

public class DesafioComissaoSalario {
	public static void main(String[] args) {
		System.out.println(calculaSalarios(new BigDecimal(2000), 2022));
	}

	private static Map<Month, BigDecimal> calculaSalarios(BigDecimal salarioBase, int ano) {
		long salarioBaseEmCentavos = salarioBase.multiply(new BigDecimal(100)).longValue();
		Map<Month, BigDecimal> pagamentoPorMes = new LinkedHashMap<>();

		for (Month mes : Month.values()) {
			LocalDate primeiroDiaDoMes = LocalDate.of(ano, mes, 1);

			long numeroDeDias = primeiroDiaDoMes
					.datesUntil(primeiroDiaDoMes.plusMonths(1))
					.filter(data -> (data.getDayOfWeek() != DayOfWeek.SATURDAY && data.getDayOfWeek() != DayOfWeek.SUNDAY))
					.count();
			
			long comissaoEmCentavos = (long) (salarioBaseEmCentavos * 0.005 * numeroDeDias);
			BigDecimal pagamentoDoMes = BigDecimal.valueOf(comissaoEmCentavos + salarioBaseEmCentavos, 2);
			pagamentoPorMes.put(mes, pagamentoDoMes);
		}

		return pagamentoPorMes;
	}
}
