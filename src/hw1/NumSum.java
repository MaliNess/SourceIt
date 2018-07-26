package hw1;

public class NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = Integer.parseInt(args[0]), output=num;
			int sum = 0;
			do {
				sum+=num%10;
				num/=10;
			} while (num!=0);
			
			System.out.println("Sum of digits in number "+ output + " equals " + sum);
	}

}
