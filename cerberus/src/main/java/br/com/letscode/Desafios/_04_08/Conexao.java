package br.com.letscode.Desafios._04_08;

public class Conexao {
	private final No no1;
	private final No no2;

	Conexao(No no1, No no2) {
		this.no1 = no1;
		this.no2 = no2;
	}

	public No getNo1() {
		return no1;
	}

	public No getNo2() {
		return no2;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conexao))
			return false;
		Conexao outraConexao = (Conexao) obj;
		return (this.no1.equals(outraConexao.no1) && this.no2.equals(outraConexao.no2)) ||
				(this.no1.equals(outraConexao.no2) && this.no2.equals(outraConexao.no1));
	}

	@Override
	public int hashCode() {
		int x = no1.getNumero();
		int y = no2.getNumero();
		return ((x + y)*(x + y + 1)/2) + y;
	}

	@Override
	public String toString() {
		return String.format("<%d, %d>", no1.getNumero(), no2.getNumero());
	}
}
