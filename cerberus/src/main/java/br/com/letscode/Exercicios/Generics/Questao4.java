package br.com.letscode.Exercicios.Generics;

import java.util.Arrays;
import java.util.List;

public class Questao4 {

	static <T> T retornaIgual(T entrada) {
		return entrada;
	}

	static <T extends CharSequence> T retornaIgual (T entrada) {
		System.out.println("SEQUENCIA DETECTADA");
		return entrada;
	}
	
	public static void main(String[] args) {
		String s = "olá";
		List<Integer> l = Arrays.asList(1,2,3);
		System.out.println(retornaIgual(s));
		System.out.println(retornaIgual(l));
	}
}
