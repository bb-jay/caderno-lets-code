package br.com.letscode.Aulas._08_08.ConcatenacaoComFluentInterface.Thiago;

import br.com.letscode.Aulas._08_08.ConcatenacaoComFluentInterface.Interfaces.Name;

public class Main {
	public static void main(String[] args) {
		Name criaNome = 
				name -> 
						middleName -> 
								lastName -> 
										() -> 
												System.out.printf("%s %s %s %n", name, middleName, lastName);

		criaNome
				.name("João")
				.middleName("Silva")
				.lastName("Sauro")
				.printName();
	}
}
