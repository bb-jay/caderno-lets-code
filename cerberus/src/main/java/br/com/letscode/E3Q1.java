package br.com.letscode;

public class E3Q1 {
	public static void main(String[] args) {
		System.out.println(higher(2, 3));
		System.out.println(higher(2, 2));
		System.out.println(higher(3, 2));
		System.out.println(higher(-2, 3));
		System.out.println(higher(-2, -3));
	}

	public static int higher(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
}
