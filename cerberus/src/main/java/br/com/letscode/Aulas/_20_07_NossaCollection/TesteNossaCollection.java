package br.com.letscode.Aulas._20_07_NossaCollection;

public class TesteNossaCollection {
	public static void main(String[] args) {
		NossaCollection<Integer> ci = new NossaCollection<>();
		ci.add(1);
		ci.add(5);
		ci.add(16);
		ci.add(1456);
		ci.add(21);
		ci.add(9);
		ci.add(2);
		ci.add(2);
		ci.add(2);
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
