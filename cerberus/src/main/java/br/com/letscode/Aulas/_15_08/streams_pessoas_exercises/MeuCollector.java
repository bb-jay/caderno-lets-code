package br.com.letscode.Aulas._15_08.streams_pessoas_exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MeuCollector {

	public static void main(String[] args) {
		Garagem garagem = Stream.of(new Carro("BMW"), new Carro("Ford"))
				.collect(coletor);

		System.out.println(garagem);
	}

	private static Collector<Carro, List<Carro>, Garagem> coletor = new Collector<Carro, List<Carro>, Garagem>() {

		@Override
		public Supplier<List<Carro>> supplier() {
			return ArrayList::new;
		}

		@Override
		public BiConsumer<List<Carro>, Carro> accumulator() {
			return (lista, carro) -> lista.add(carro);
		}

		@Override
		public BinaryOperator<List<Carro>> combiner() {
			return (lista1, lista2) -> {
				lista1.addAll(lista2);
				return lista1;
			};
		}

		@Override
		public Function<List<Carro>, Garagem> finisher() {
			return lista -> new Garagem(lista);
		}

		@Override
		public Set<Characteristics> characteristics() {
			return Collections.emptySet();
		}

	};
}

class Carro {
	private String nome;

	public Carro(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}

class Garagem {
	private List<Carro> carros;

	Garagem(Collection<Carro> carros) {
		this.carros = carros.stream().collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return carros.toString();
	}
}
