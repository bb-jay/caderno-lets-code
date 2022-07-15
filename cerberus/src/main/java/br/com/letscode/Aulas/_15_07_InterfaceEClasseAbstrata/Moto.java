package br.com.letscode.Aulas._15_07_InterfaceEClasseAbstrata;

public class Moto extends Veiculo implements Buzinavel{

	public Moto(int potencia, String placa, String cor) {
		super(potencia, 2, placa, cor);
	}
	
	@Override
	public void buzinar() {
		System.out.println("biiiiiii");	
	}
}
