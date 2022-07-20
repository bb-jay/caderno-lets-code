package br.com.letscode.Aulas._20_07_NossaCollection;

import java.util.Collection;
import java.util.LinkedList;

public class NossaCollection<E extends Comparable<E>> extends LinkedList<E> {

	@Override
	public boolean add(E e) {
		for (int i = 0; i < this.size(); i++) {
			if (e.compareTo(this.get(i)) < 0) {
				continue;
			}
			super.add(i, e);
			return true;
		}
		return super.add(e);
	}

	@Override
	public void add(int index, E e) {
		this.add(e);
	}
	
	@Override
	public void addFirst(E e) {
		this.add(e);
	}
	
	@Override
	public void addLast(E e) {
		this.add(e);
	}
	
	@Override
	public void push(E e) {
		this.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		for (E item: c) 
			this.add(item);
		return true;
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return this.addAll(c);
	}

	@Override
	public E remove() {
		return super.removeLast();
	}

}
