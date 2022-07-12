package br.com.letscode.Desafios._12_07;

public class Sorveteria {
	public static void main(String[] args) {
		Sorveteria fabrica = new Sorveteria();

    final Sorvete massaNoCopoMorango = fabrica.criarSorvete(TipoSorvete.COPO, "Morango");
    final Sorvete palitoChocolate = fabrica.criarSorvete(TipoSorvete.PALITO, "Chocolate");
    final Sorvete massaNaCasquinhaBaunilha = fabrica.criarSorvete(TipoSorvete.CONE, "Baunilha");

    massaNoCopoMorango.degustar();
    palitoChocolate.degustar();
    massaNaCasquinhaBaunilha.degustar();
	}

	private Sorvete criarSorvete(TipoSorvete tipo, String sabor) {
		return new Sorvete(tipo, sabor);
	}

	private static class Sorvete {
		private final TipoSorvete tipo;
		private final String sabor;
		

		Sorvete(TipoSorvete tipo, String sabor) {
			this.tipo = tipo;
			this.sabor = sabor;
		}

		public void degustar() {
			System.out.printf(
				"Este sorvete de %s é do sabor de %s\n",
				this.tipo,
				this.sabor
			);
		}

	}

	private static enum TipoSorvete {
		COPO("massa no copo"),
		PALITO("palito"),
		CONE("massa no cone");
		
		private final String descricao;
		
		TipoSorvete(String descricao) {
			this.descricao = descricao;
		}
		
		@Override
		public String toString() {
			return this.descricao;
		}
	}
}
