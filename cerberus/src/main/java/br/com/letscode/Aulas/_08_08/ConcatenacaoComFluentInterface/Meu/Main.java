package br.com.letscode.Aulas._08_08.ConcatenacaoComFluentInterface.Meu;



public class Main {
	
	public static void main(String[] args) {
		CreateName
				.start()
				.name("João")
				.middleName("Silva")
				.lastName("Sauro")
				.printName();
	}

}

