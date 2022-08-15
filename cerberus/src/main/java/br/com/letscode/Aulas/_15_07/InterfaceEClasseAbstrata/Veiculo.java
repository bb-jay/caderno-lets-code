package br.com.letscode.Aulas._15_07.InterfaceEClasseAbstrata;

import java.util.HashSet;
import java.util.Set;

public abstract class Veiculo {
	private String cor;
	private int potencia;
	private final int numeroDeRodas;
	private final String placa;
	private static final Set<String> placas = new HashSet<>();
	
	
	Veiculo(int potencia, int numeroDeRodas, String placa, String cor) {
		this.potencia = potencia;
		this.numeroDeRodas = numeroDeRodas;
		if (placas.contains(placa))
			throw new IllegalArgumentException("Placa já existe");
		this.placa = placa;
		placas.add(placa);
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getNumeroDeRodas() {
		return numeroDeRodas;
	}

	public String getPlaca() {
		return placa;
	}
}
