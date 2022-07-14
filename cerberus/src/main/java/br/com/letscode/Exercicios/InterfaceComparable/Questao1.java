package br.com.letscode.Exercicios.InterfaceComparable;

import java.util.Arrays;

public class Questao1 {
	public static class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;

    public Pessoa(final String nome, final int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "O meu nome é " + this.nome + " e tenho " + this.idade + " anos!";
    }

		@Override
		public int compareTo(Pessoa o) {
			return this.nome.compareToIgnoreCase(o.nome);
		}
	}

	public static void main( String[] args ) {
		final Pessoa p1 = new Pessoa("Nuno", 36);
		final Pessoa p2 = new Pessoa("Alexandre", 35);
		final Pessoa p3 = new Pessoa("Bruno", 34);
		final Pessoa p4 = new Pessoa("Beatriz", 33);
		final Pessoa[] p = {p1, p2, p3, p4};
		Arrays.sort(p);
		for(Pessoa pe : p) {
				System.out.println(pe);
}
}
}
