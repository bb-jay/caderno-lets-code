package br.com.letscode.Exercicios.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Questao1 {
	public static void main(String... args) {
		final List<String> shuffleArray = new ArrayList<>();
		shuffleArray.add("Ana");
		shuffleArray.add("Bruno");
		shuffleArray.add("Carla");
		shuffleArray.add("David");
		shuffleArray.add("Eugénia");
		shuffleArray.add("Filipe");
		shuffleArray.add("Gustavo");
		shuffleArray.add("Helena");

		shuffle(shuffleArray);

		shuffleArray.forEach(System.out::println);
	}

	private static void shuffle(List<?> list) {
		Random r = new Random();
		int iteracoes = (20 + r.nextInt(20)) * (list.size() - 1);

		for (int i = 0; i < iteracoes; i++) {
			int j, k;

			j = r.nextInt(list.size());
			do {
				k = r.nextInt(list.size());
			}	while (k == j);
			swap(list, j, k);
		}
	}

	private static <T> void swap(List<T> list, int j, int k) {
		T aux = list.get(j);
		list.set(j, list.get(k));
		list.set(k, aux);
	}
}
