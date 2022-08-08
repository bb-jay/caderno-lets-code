package br.com.letscode.Aulas._08_08.ConcatenacaoComFluentInterface.Meu;

import br.com.letscode.Aulas._08_08.ConcatenacaoComFluentInterface.Interfaces.LastName;
import br.com.letscode.Aulas._08_08.ConcatenacaoComFluentInterface.Interfaces.MiddleName;
import br.com.letscode.Aulas._08_08.ConcatenacaoComFluentInterface.Interfaces.Name;
import br.com.letscode.Aulas._08_08.ConcatenacaoComFluentInterface.Interfaces.PrintName;

class CreateName implements Name, MiddleName, LastName, PrintName {

	private String name;
	private String middleName;
	private String lastName;

	private CreateName() {
	}

	//Feio
	public static Name start() {
		return new CreateName();
	}

	@Override
	public MiddleName name(String name) {
		this.name = name;
		return this;
	}

	@Override
	public LastName middleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	@Override
	public PrintName lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public void printName() {
		System.out.printf("%s %s %s", name, middleName, lastName);
	}

}