package hw8;

public class DefaultMyList implements MyList {

	private Object[] list = new Object[1000];
	private int size = 0;

	@Override
	public void add(Object e) {
		// TODO Auto-generated method stub
		list[size] = e;
		size++;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			list[i] = null;
		}
		size = 0;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		for(int i=0; i<size; i++) {
			if(list[i].equals(o)) {
				for(int j=i; j<size; j++) {
					list[j] = list[j+1];
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
		for(int i=0; i<size; i++) {
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
		for(int i=0; i<size; i++) {
			if(list[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		Object[] cc = c.toArray();
		boolean found = false;
		for(int i=0; i<c.size(); i++) {
			for(int j=0; j<size; j++) {
				if(list[j].equals(cc[i])) found = true;
			}
			if(!found) return false; 
			found = false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for(int i=0; i<size; i++) {
			sb.append(list[i].toString());
			if(i!=(size-1)) sb.append(", ");
		}
		sb.append("}");
		return sb.toString();
	}
}
