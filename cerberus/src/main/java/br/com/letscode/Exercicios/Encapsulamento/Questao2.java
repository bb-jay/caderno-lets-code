package br.com.letscode.Exercicios.Encapsulamento;

public class Questao2 {

	public static final class Fruta {

		Fruta(String nome, Cor cor, Sabor sabor, boolean casca) {
			this.cor = cor;
			this.nome = nome;
			this.sabor = sabor;
			this.casca = casca;
		}

		public static final Fruta semente = new Fruta(
				"Semente",
				Cor.MARROM,
				Sabor.AMARGO,
				false);

		private Cor cor;
		private String nome;
		private Sabor sabor;
		private boolean casca;

		public Sabor getGosto() {
			return sabor;
		}

		public void setGosto(Sabor gosto) {
			this.sabor = gosto;
		}

		public Cor getCor() {
			return cor;
		}

		public void setCor(Cor cor) {
			this.cor = cor;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void descascar() {
			if (casca && this.sabor == Sabor.AMARGO) {
				this.sabor = Sabor.DOCE;
				this.casca = false;
				System.out.println("Descascada!");
			} else {
				System.out.println("Não tem pra quê descascar");
			}
		}

		public void comer() {
			if (!this.equals(semente)) {
				System.out.println("NHAC");
				switch (this.sabor) {
					case SALGADO:
						System.out.println("Fruta salgada??!?!?");
						break;
					case DOCE:
						System.out.println("Delícia!");
						break;
					case AMARGO:
						System.out.println("Eca!");
						break;
					case AZEDO:
						System.out.println("**BOCA CHUPADA**");
						break;
					case UMAMI:
						System.out.println("SUGOI");
						break;
				}
				this.nome = semente.nome;
				this.sabor = semente.sabor;
				this.cor = semente.cor;
				this.casca = semente.casca;
			} else {
				System.out.println("Eca, não vou comer semente!");
			}
		}

		@Override
		public boolean equals(Object obj) {
			Fruta outra = (Fruta) obj;
			return outra.nome == this.nome &&
					outra.casca == this.casca &&
					outra.sabor == this.sabor &&
					outra.cor == this.cor;
		}

		@Override
		public String toString() {
			return '{' + this.nome + ' ' + this.cor.name() + ' ' + this.sabor.name() + ' '
					+ (this.casca ? "com casca" : "sem casca") + '}';
		}

	}

	public static enum Cor {
		VERMELHO, AZUL, VERDE, LARANJA, AMARELO, MARROM;
	}

	public static enum Sabor {
		AZEDO, DOCE, AMARGO, SALGADO, UMAMI;
	}

	public static void main(String[] args) {
		Fruta maca = new Fruta("Maçã", Cor.VERMELHO, Sabor.DOCE, true);
		Fruta macaVerde = new Fruta("Maçã", Cor.VERDE, Sabor.DOCE, true);
		Fruta banana = new Fruta("Banana", Cor.AMARELO, Sabor.AMARGO, true);
		Fruta laranja = new Fruta("Laranja", Cor.LARANJA, Sabor.AMARGO, true);

		maca.descascar();
		maca.comer();
		System.out.println();
		
		macaVerde.descascar();
		macaVerde.comer();
		macaVerde.comer();
		System.out.println();

		banana.descascar();
		banana.comer();
		System.out.println();

		laranja.comer();
		System.out.println(

		);
	}
}
