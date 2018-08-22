package hw8;

import java.util.Iterator;

public class DefaultMyList implements MyList, ListIterable {

	private Object[] list = new Object[1000];
	private int size = 0;

	@Override
	public void add(Object e) {
		list[size] = e;
		size++;
	}

	@Override
	public void clear() {
		for (int i = 0; i < size; i++) {
			list[i] = null;
		}
		size = 0;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < size; i++) {
			if (list[i].equals(o)) {
				for (int j = i; j < size; j++) {
					list[j] = list[j + 1];
				}
				size--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] resList = new Object[size];
		for (int i = 0; i < size; i++) {
			resList[i] = list[i];
		}
		return resList;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			if (list[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		Object[] cc = c.toArray();
		boolean found = false;
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < size; j++) {
				if (list[j].equals(cc[i]))
					found = true;
			}
			if (!found)
				return false;
			found = false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (int i = 0; i < size; i++) {
			sb.append(list[i].toString());
			if (i != (size - 1))
				sb.append(", ");
		}
		sb.append("}");
		return sb.toString();
	}

	@Override
	public Iterator<Object> iterator() {
		return new IteratorImpl();
	}

	@Override
	public ListIterator listIterator() {
		return new ListIteratorImpl();
	}

	private class IteratorImpl implements Iterator<Object> {

		private int current = -1;
		private boolean usedNext = false;

		public boolean hasNext() { // returns true if the iteration has more elements
			if (current + 1 != size())
				return true;
			else
				return false;
		}

		public Object next() { // returns the next element in the iteration
			if (hasNext()) {
				usedNext = true;
				current++;
				return list[current];
			} else if (size() == 1 && current == 0) {
				usedNext = true;
				current = size;
				return list[0];
			} else
				throw new ArrayIndexOutOfBoundsException();
		}

		public void remove() { // removes from the underlying collection the last element returned by this
								// iterator
			if (usedNext) {
				for (int j = current; j < size - 1; j++) {
					list[j] = list[j + 1];
				}
				list[size - 1] = null;
				size--;
				usedNext = false;
			} else
				throw new IllegalStateException();
		}
	}

	private class ListIteratorImpl extends IteratorImpl implements ListIterator {
		private boolean usedPrev = false;
		{
			super.current = size;
		}

		@Override
		public boolean hasPrevious() {
			if ((super.current - 1) > -1)
				return true;
			return false;
		}

		@Override
		public Object previous() {
			if (hasPrevious()) {
				usedPrev = true;
				super.current--;
				return list[super.current];
			} else if (size() == 1 && super.current == size()) {
				usedPrev = true;
				super.current = -1;
				return list[0];
			} else
				throw new ArrayIndexOutOfBoundsException();
		}

		@Override
		public void set(Object e) {
			if (super.usedNext || usedPrev) {
				if (super.current == size())
					list[super.current - 1] = e;
				else if (super.current == -1)
					list[super.current + 1] = e;
				else
					list[super.current] = e;
			} else
				throw new IllegalStateException();
		}

		@Override
		public void remove() {
			if (super.usedNext || usedPrev) {
				for (int j = super.current; j < size - 1; j++) {
					list[j] = list[j + 1];
				}
				list[size - 1] = null;
				size--;
				super.usedNext = false;
				usedPrev = false;
			} else
				throw new IllegalStateException();
		}

	}

}
