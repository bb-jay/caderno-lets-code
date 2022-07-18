package br.com.letscode.Exercicios.JavaInterface;

public class Questao4 {
	
	public static interface Inter {
		public void dizOi();
	}

	public static void main(String[] args) {
		Inter oi = new Inter() {
			@Override
			public void dizOi() {
				System.out.println("Oi!");
			}
		};

		oi.dizOi();
	}
}


