package hw2;

import java.util.Scanner;

public class Separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int choise = 1, num;
		String res;
		do {
			res="";
			System.out.print("Input number: ");
			num = in.nextInt();
			do {
				res+=Integer.toString(num%10);
				num/=10;
			}while(num!=0);
			for (int i = 0; i < res.length(); i++) {
				System.out.println(res.charAt(res.length()-i-1));
			}
			System.out.println("Input 0 to exit, to continue input any other digit:");
			choise = in.nextInt();
		}while(choise!=0);
		in.close();
		
		//Way ¹2
		
//		Scanner in = new Scanner(System.in);
//		int choise = 1;
//		String num;
//		do {
//			System.out.print("Input number: ");
//			num = Integer.toString(in.nextInt());
//			char[] charArray = num.toCharArray();
//			for (int i = 0; i < charArray.length; i++) {
//				System.out.println(charArray[i]);
//			}
//			System.out.println("Input 0 to exit, to continue input any other digit:");
//			choise = in.nextInt();
//		}while(choise!=0);
//		in.close();
	}
}
