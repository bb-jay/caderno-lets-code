package br.com.letscode.Aulas._27_07.maquinas;

public class MaquinaPremium extends Maquina implements Expressavel {

	@Override
	public void tirarCafe() {
		if (super.dispensar()) {
			moerGraoCafe();
			System.out.println("TOMA UM CAFÉ MELHOR");
		}
	}

	@Override
	public void recarregar() {
		adicionarGraoCafe();
	}

	private void moerGraoCafe() {
		System.out.println("Moendo grãos...");
	}

	private void adicionarGraoCafe(){
		System.out.println("Colocando grãos...");
		super.reservatorioCafe = 10;
	}

	@Override
	public void tirarExpresso() {
		if (super.dispensar()) {
			moerGraoCafe();
			System.out.println("QUE CAFE PRENSADIM");
		}
	}
	
}
