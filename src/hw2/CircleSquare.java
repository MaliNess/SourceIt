package hw2;

import java.util.Scanner;

public class CircleSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input radius:");
		double r = Double.parseDouble(in.nextLine());
		double c = 2*Math.PI*r;
		System.out.println("Ñircumference equals " + c);
		in.close();
	}
}
