package hw8;

import java.util.Arrays;

public class DemoMyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMyList l = new DefaultMyList();
		String s = new String("Hello");
		l.add(s);
		l.add(1);
		l.add(25.4);
		l.add('f');
		
		System.out.println("MyList size(): " + l.size());
		System.out.println("MyList toString(): " + l.toString());
		System.out.println("=================================================");
		System.out.println("MyList contains('a'): " + l.contains('a'));
		System.out.println("MyList contains(1): " + l.contains(1));
		System.out.println("=================================================");
		System.out.println("MyList remove(25.4): " + l.remove(25.4));
		System.out.println("MyList remove('a'): " + l.remove('a'));
		System.out.println("MyList toArray(): " + Arrays.toString(l.toArray()));
		l.add(25.4);
		System.out.println("MyList add(25.4): " + l.toString());
		System.out.println("=================================================");
		
		DefaultMyList n = new DefaultMyList();
		n.add(s);
		n.add(1);
		n.add(25.4);
		n.add('f');
		
		System.out.println("MyList toString(): " + l.toString());
		System.out.println("NewMyList toString(): " + n.toString());
		System.out.println("NewMyList containsAll(MyList): " + n.containsAll(l));
		System.out.println("=================================================");
		System.out.println("NewMyList remove(25.4)"
				+ ": " + n.remove(25.4));
		System.out.println("MyList toString(): " + l.toString());
		System.out.println("NewMyList toString(): " + n.toString());
		System.out.println("NewMyList containsAll(MyList): " + n.containsAll(l));
		System.out.println("MyList containsAll(NewMyList): " + l.containsAll(n));
		System.out.println("=================================================");
		l.clear();
		System.out.println("MyList clear(): " + l.toString());
	}

}
