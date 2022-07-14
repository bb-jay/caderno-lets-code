package br.com.letscode.Desafios._14_07;

public class SomaOitoComLetras {
	
	public static void main(String[] args) {
		System.out.println(somaOitoComLetras("xo6njr2kiw9"));
		System.out.println(somaOitoComLetras("2exo6njr2kiw9"));
		System.out.println(somaOitoComLetras("xo5njr2kiw9"));
		System.out.println(somaOitoComLetras("xo6njr3kiw9"));
		System.out.println(somaOitoComLetras("xonjr2kiw6"));
		System.out.println(somaOitoComLetras("xo6njrkiw"));
		System.out.println(somaOitoComLetras("4654654852"));
		System.out.println(somaOitoComLetras("xo6jr2ki9"));
		System.out.println(somaOitoComLetras("x2onj2kiw6"));
		System.out.println(somaOitoComLetras("frdts2XXX6xxbl2XXXeee5"));
	}

	private static boolean somaOitoComLetras(String s) {
		
		int primeiro;
		int segundo;
		
		for (int i = 0; i < s.length() - 4;) {
			
			if (!ehNumero(s.charAt(i))) {
				i = i + 1;
				continue;
			}

			primeiro = Integer.parseInt(String.valueOf(s.charAt(i)));
			
			if (ehNumero(s.charAt(i+1))) {
				i = i + 1;
				continue;
			}
			if (ehNumero(s.charAt(i+2))) {
				i = i + 2;
				continue;
			}
			if (ehNumero(s.charAt(i+3))) {
				i = i + 3;
				continue;
			}
			if (!ehNumero(s.charAt(i+4))) {
				i = i + 5;
				continue;
			}

			segundo = Integer.parseInt(String.valueOf(s.charAt(i + 4)));

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
