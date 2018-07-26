package hw1;

public class Del {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int a = Integer.parseInt(args[0]), aa=a;
			int b = Integer.parseInt(args[1]), ab=b;
		
			while(a!=0 && b!=0) {
				if(a>b) {
					a%=b;
				}
				else {
					b%=a;
				}
			}
			System.out.println("The greatest common divisor of " +aa+ " and "+ ab + " is " + (a+b));
	}

}
