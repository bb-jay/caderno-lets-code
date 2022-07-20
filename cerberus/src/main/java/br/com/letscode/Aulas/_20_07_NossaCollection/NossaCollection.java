package br.com.letscode.Aulas._20_07_NossaCollection;

import java.util.LinkedList;

public class NossaCollection<E extends Comparable<E>> extends LinkedList<E> {

	@Override
	public boolean add(E e) {
		for (int i = 0; i < this.size(); i++) {
			if (e.compareTo(this.get(i)) < 0) {
				continue;
			}
			this.add(i, e);
			return true;
		}
		return super.add(e);
	}

	@Override
	public E remove() {
		return super.removeLast();
	}

}
