package br.com.letscode.Desafios._18_07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnirListasSemRepetir {
	
	
	private static void unirSemRepetir(String a, String b) {
		
		String[] aArray = a.split(",");
		String[] bArray = b.split(",");
		Set<Integer> numeros = new HashSet<>();
		
		correArray(aArray, numeros);
		correArray(bArray, numeros);
		List<Integer> saida = new ArrayList<>(numeros);
		saida.sort((x, y) -> y - x);
		
		System.out.println(saida);
	}

	private static void correArray(String[] array, Set<Integer> numeros) {
		for (int i = 0; i < array.length; i++) {
			
			int daVez;
			try {
				daVez = Integer.parseInt(array[i].replace(" ", ""));
			} catch (NumberFormatException e) {
				System.out.printf("Ué, deu ruim no %s: %s", i, e.getMessage());
				continue;
			}

			numeros.add(daVez);
		}
	}
	
	public static void main(String[] args) {
		unirSemRepetir("1,6,8,5,2,3,9", "8,6,56,29,45,1,2,3");	
		unirSemRepetir("1,16,28,5,2,33,9", "28,16,56,29,45,1,27,3");	
	}
}
