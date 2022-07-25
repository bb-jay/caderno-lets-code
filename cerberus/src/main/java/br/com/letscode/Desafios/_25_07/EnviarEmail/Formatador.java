package br.com.letscode.Desafios._25_07.EnviarEmail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Formatador {
	public String paraMaiusculas(String s) {
		return s.toUpperCase();
	}

	public String paraMinusculas(String s) {
		return s.toLowerCase();
	}

	public String paraCamelCase(String s) {
		if (s == null || s == "")
			return "";
		s = s.toLowerCase();
		List<String> palavras = new ArrayList<>(Arrays.asList(s.split(" ")));
		String saida = palavras.remove(0);
		if (palavras.size() == 0)
			return saida;
		for (String palavra : palavras)
			saida += palavra.substring(0, 1).toUpperCase() + palavra.substring(1);
		return saida;
	}

	public String removerAcentuacao(String s) {
		
		Map<String,String> dePara = new HashMap<>();
		dePara.put("[áàâã]", "a");
		dePara.put("[óõô]", "o");
		dePara.put("[éê]", "e");
		dePara.put("[í]", "i");
		dePara.put("[ç]", "c");

		for (Entry<String, String> troca: dePara.entrySet()) {
			s = s.replaceAll(troca.getKey().toUpperCase(), troca.getValue().toUpperCase());
			s = s.replaceAll(troca.getKey().toLowerCase(), troca.getValue().toLowerCase());
		}
		
		
		
		s = s.replaceAll("[ú]", "u");
		return s;
	}
}
