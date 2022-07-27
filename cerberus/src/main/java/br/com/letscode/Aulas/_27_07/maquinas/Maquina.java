package br.com.letscode.Aulas._27_07.maquinas;

public abstract class Maquina {

	protected int reservatorioCafe;

	protected boolean dispensar() {
		if (reservatorioCafe == 0) {
			System.out.println("Está vazia...");
			return false;
		}
		reservatorioCafe--;
		return true;
	}
	
	public abstract void tirarCafe();
	public abstract void recarregar();
}
