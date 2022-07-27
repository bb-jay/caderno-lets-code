package br.com.letscode.Aulas._27_07.maquinas;

public class MaquinaBasica extends Maquina {

	@Override
	public void tirarCafe() {
		if (super.dispensar())
			System.out.println("Toma um café meio meia-boca...");
	}

	@Override
	public void recarregar() {
		this.adicionarCafeEmPo();
	}

	private void adicionarCafeEmPo() {
		System.out.println("Recarregando...");
		super.reservatorioCafe = 10;
	}

}
