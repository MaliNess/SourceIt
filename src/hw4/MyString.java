package hw4;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		for(int i = 1; i<6; i++) {
			if(i==1 ) s+="Pi with %d is %."+i+"f.";
			else s+="\nPi with %d is %."+i+"f.";
			s=String.format(s, i, Math.PI);
		}
		System.out.println(s);
	}

}
