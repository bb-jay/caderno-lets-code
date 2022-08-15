package br.com.letscode.Aulas._20_07.NossaCollection;

import java.util.Arrays;

public class TesteNossaCollection {
	public static void main(String[] args) {
		NossaCollection<Integer> ci = new NossaCollection<>();
		ci.add(1);
		ci.add(5, 5);
		ci.add(9, 16);
		ci.addAll(Arrays.asList(1456,54,56,5465,21));
		ci.addFirst(21);
		ci.addFirst(9);
		ci.add(2);
		ci.addLast(2);
		ci.addLast(2);
		ci.add(98);
		ci.add(551);
		ci.add(1);
		ci.add(1);
		ci.add(19);
		ci.add(15);
		System.out.println(ci);
		System.out.println(ci.remove());
		System.out.println(ci.remove());
		System.out.println(ci.remove());
		System.out.println(ci.remove());
		System.out.println(ci.remove());
		System.out.println(ci.remove());
		System.out.println(ci.remove());
		System.out.println(ci);

	}
}
