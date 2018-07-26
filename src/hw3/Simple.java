package hw3;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check;
		for (int i=2; i<=100; i++) {
			check = true;
			for(int j = 2; j<i; j++) {
				if(i%j==0) check=false;
			}
			if(check) System.out.print(i + " ");
		}
	}

}
