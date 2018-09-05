package hw9;

import java.util.ArrayList;

public class LRUCache {

	private int size;
	private int capacity;
	private ArrayList<LRUElem> cache;

	public LRUCache(int capacity) {
		size = 0;
		this.capacity = capacity;
		cache = new ArrayList<LRUElem>(capacity);
	}

	public int get(int key) {
		for (LRUElem lruElem : cache) {
			if (lruElem.getKey() == key) {
				lruElem.changePos();
				return lruElem.getValue();
			}
		}
		return -1;
	}

	public void put(int key, int value) {
		size++;
		LRUElem el = new LRUElem(key, value);
		if (el.getKey() != 0) {
			if (size <= capacity)
				cache.add(el);
			else {
				cache.remove(findLRU());
				cache.add(el);
			}
			el.changePos();
		}
	}

	private LRUElem findLRU() {
		LRUElem LRU = new LRUElem();
		for (LRUElem lruElem : cache) {
			if (LRU.getPos() < lruElem.getPos()) {
				LRU = lruElem;
			}
		}
		return LRU;
	}

	private class LRUElem {
		private int value;
		private int key;
		private int pos;

		protected LRUElem(int key, int value) {
			this.setKey(key);
			this.setValue(value);
			this.changePos();
		}

		protected LRUElem() {
			pos = -1;
		}

		private boolean checkKey(int key) {
			for (LRUElem lruElem : cache) {
				if (key == lruElem.getKey())
					return false;
			}
			return true;
		}

		public int getKey() {
			return key;
		}

		private void setKey(int key) {
			if (checkKey(key))
				this.key = key;
			else
				throw new IllegalArgumentException();
		}

		public int getValue() {
			return value;
		}

		private void setValue(int value) {
			this.value = value;
		}

		private void changePos() {
			pos = 0;
			for (LRUElem lruElem : cache) {
				lruElem.pos++;
			}
		}

		public int getPos() {
			return pos;
		}

	}
}
