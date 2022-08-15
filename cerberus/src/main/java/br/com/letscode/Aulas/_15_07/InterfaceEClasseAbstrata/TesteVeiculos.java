package br.com.letscode.Aulas._15_07.InterfaceEClasseAbstrata;

public class TesteVeiculos {
	public static void main(String[] args) {
		Carro c = new Carro(150, "OMM-9492", "Preto");
		c.buzinar();

		Moto m = new Moto(30, "OMM-9491", "Vermelho");
		m.buzinar();

		System.out.println();

		c.trocarEstacaoRadio(200.0);
		c.ligarRadio();
		c.ligarRadio();
		c.trocarEstacaoRadio(50.0);
		c.trocarEstacaoRadio(150.0);
		c.desligarRadio();
		c.desligarRadio();
	}
}
