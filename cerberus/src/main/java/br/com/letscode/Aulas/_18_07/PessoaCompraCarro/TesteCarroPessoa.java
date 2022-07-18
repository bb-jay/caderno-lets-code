package br.com.letscode.Aulas._18_07.PessoaCompraCarro;

public class TesteCarroPessoa {
	public static void main(String[] args) {
		Pessoa ze = new Pessoa("Zé", 59);
		Pessoa ti = new Pessoa("Thiago", 34);
		Pessoa srBr = new Pessoa("Excelentíssimo Senhor Barbosa", 50);

		System.out.println(comprarCarro(ze));
		System.out.println(comprarCarro(ti));
		System.out.println(comprarCarro(srBr));

	}

	private static class ParFeliz <T1,T2> {
		private final T1 t1;
		private final T2 t2;

		ParFeliz(T1 t1, T2 t2) {
			this.t1 = t1;
			this.t2 = t2;	
		}

		// public T1 getT1() {
		// 	return this.t1;
		// }

		// public T2 getT2() {
		// 	return this.t2;
		// }

		@Override
		public String toString() {
			return this.t1 + " feliz com " + this.t2;
		}
	}

	private static ParFeliz<Pessoa, Carro> comprarCarro(Pessoa dono) {
		Carro caranga;
		if (dono.getIdade() < 50) {
			caranga = new Carro("Preto");
		} else if (dono.getIdade() == 50) {
			caranga = new Carro("Prata");
		} else {
			caranga = new Carro("Branco");
		}

		return new ParFeliz<>(dono, caranga);
	}
}
