package br.com.letscode.Aulas._15_07.InterfaceEClasseAbstrata;

public class Carro extends Veiculo implements Buzinavel, Radio {

	private boolean radioLigado;

	public Carro(int potencia, String placa, String cor) {
		super(potencia, 4, placa, cor);
	}

	@Override
	public void buzinar() {
		System.out.println("FOOOOM");
	}

	@Override
	public void ligarRadio() {
		if (this.radioLigado) {
			System.out.println("Já está ligado");
		} else {
			this.radioLigado = true;
			System.out.println("TRALALALALALALALA");
		}
	}

	@Override
	public void desligarRadio() {
		if (!this.radioLigado) {
			System.out.println("Já está desligado");
		} else {
			this.radioLigado = false;
			System.out.println("*CLICK*");
		}
	}

	@Override
	public void trocarEstacaoRadio(double estacao) {
		if (!this.radioLigado) {
			System.out.println("Está desligado");
			return;
		}
		System.out.println("AGORA OUVINDO A " + estacao + "FM!!!!");
		System.out.println("TRALALALALLA");
	}

}
