package br.com.letscode.Aulas._05_08;

public class TestaSQL {
	public static void main(String[] args) {
		CriaSQL
				.select("nome", "idade", "carro")
				.where("cliente.Name = Thiago")
				.and("cliente.carro=Ferrari")
				.or("cliente.idade > 40")
				.from("tableaCliente")
				.imprimeQuery();
	}
}
