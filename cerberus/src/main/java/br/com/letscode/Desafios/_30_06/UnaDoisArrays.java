package br.com.letscode.Desafios._30_06;

public class UnaDoisArrays {
	public static void main(String[] args) {
		int[] arr1 = {1,6,9,10,11,12,33,52,54};
		int[] arr2 = {0,2,3,4,5,8,52,94,102};

		for (int num: juntarArrays(arr1, arr2)) System.out.print(num + " ");
		
		System.out.println();
		
		for (int num: juntarArraysOrdenados(arr1, arr2)) System.out.print(num + " ");
	}

	public static int[] juntarArrays(int[] array1, int[] array2) {
		int[] consolidada = new int[array1.length + array2.length];
		
		for (int i = 0; i < array1.length; i++){
			consolidada[i] = array1[i];
		}
		
		for (int j = 0; j < array2.length; j++){
			consolidada[j + array1.length] = array2[j];
		}

		for (int i = 0; i < consolidada.length - 1; i++){
			for (int j = i + 1; j < consolidada.length; j++) {
				if (consolidada[i] > consolidada[j]) {
					int aux = consolidada[i];
					consolidada[i] = consolidada[j];
					consolidada[j] = aux;
				}
			}
		}

		return consolidada;
	}

	public static int[] juntarArraysOrdenados(int[] array1, int[] array2){
		
		int tam1 = array1.length;
		int tam2 = array2.length;
		int tamTotal = tam1 + tam2;
		
		int i1 = 0;
		int i2 = 0;
		
		int[] consolidada = new int[tamTotal];

		for (int i = 0; i < tamTotal ; i++){
			
			if (i1 == tam1) consolidada[i] = array2[i2++]; 
			else if (i2 == tam2) consolidada[i] = array1[i1++];

			else {
				if (array1[i1] < array2[i2]) consolidada[i] = array1[i1++];
				else consolidada[i] = array2[i2++];
			} 
				
		}
		
		return consolidada;
	}

}
