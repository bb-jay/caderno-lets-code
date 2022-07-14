package br.com.letscode.Desafios._14_07;

public class SomaOitoComLetras {

	public static void main(String[] args) {
		System.out.println(somaOitoComLetras("2XXX4"));
		System.out.println(somaOitoComLetras("2XXa4XXX4"));
		System.out.println(somaOitoComLetras("2Xab4"));
		System.out.println(somaOitoComLetras("2XX14"));
		System.out.println(somaOitoComLetras("2X124"));
		System.out.println(somaOitoComLetras("xo6njrkiw"));
		System.out.println(somaOitoComLetras("4652XXX654852"));
		System.out.println(somaOitoComLetras("xo6jr2ki9"));
		System.out.println(somaOitoComLetras("x2onj2kiw6"));
		System.out.println(somaOitoComLetras("frdts2XXX6xxbl2XXXeee5"));
	}

	private static boolean somaOitoComLetras(String s) {
		boolean resCompacto = somaOitoComLetrasCompacto(s);
		boolean resLegivel = somaOitoComLetrasLegivel(s);
		if (resCompacto != resLegivel)
			throw new RuntimeException("Não batem para a string " + s);
		return resCompacto;
	}

	private static boolean somaOitoComLetrasCompacto(String s) {
		s = s.toUpperCase();

		for (int i = 0; i < s.length() - 4;) {

			if (!ehNumero(s.charAt(i++)) ||
					ehNumero(s.charAt(i)) ||
					s.charAt(i++) != 'X' ||
					ehNumero(s.charAt(i)) ||
					s.charAt(i++) != 'X' ||
					ehNumero(s.charAt(i)) ||
					s.charAt(i++) != 'X' ||
					!ehNumero(s.charAt(i++)))
				continue;

			int primeiro = Integer.parseInt(String.valueOf(s.charAt(i - 5)));
			int segundo = Integer.parseInt(String.valueOf(s.charAt(--i)));
			if (primeiro + segundo == 8) return true;

		}
		return false;
	}

	private static boolean somaOitoComLetrasLegivel(String s) {

		s = s.toUpperCase();

		for (int i = 0; i < s.length() - 4;) {

			if (!ehNumero(s.charAt(i)) || ehNumero(s.charAt(i + 1))) {
				i = i + 1;
				continue;
			}
			if (s.charAt(i + 1) != 'X' || ehNumero(s.charAt(i + 2))) {
				i = i + 2;
				continue;
			}
			if (s.charAt(i + 2) != 'X' || ehNumero(s.charAt(i + 3))) {
				i = i + 3;
				continue;
			}
			if (s.charAt(i + 3) != 'X') {
				i = i + 4;
				continue;
			}
			if (!ehNumero(s.charAt(i + 4))) {
				i = i + 5;
				continue;
			}
			
			int primeiro = Integer.parseInt(String.valueOf(s.charAt(i)));
			int segundo = Integer.parseInt(String.valueOf(s.charAt(i + 4)));
			if (primeiro + segundo == 8) return true;

			i = i + 4;

		}

		return false;
	}

	private static boolean ehNumero(char c) {
		try {
			Integer.parseInt(String.valueOf(c));
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
