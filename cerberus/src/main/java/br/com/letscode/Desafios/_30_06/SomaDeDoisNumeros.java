package br.com.letscode.Desafios._30_06;

public class SomaDeDoisNumeros {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9};
		for (int num :somaDois(nums, 15)) {
			System.out.print(num + " ");
		}
	}

	public static int[] somaDois(int[] nums, int alvo) {
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > alvo / 2 + 1) break;

			for (int j = i + 1; j < nums.length; j++) {				
				if (nums[i] + nums[j] > alvo) break;

				if (nums[i] + nums[j] == alvo) {
					int[] resposta = {i, j};
					return resposta;
				}

			}
		}
		return null;
	}
}
