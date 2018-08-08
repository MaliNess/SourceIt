package hw3;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input max value:");
		int max = in.nextInt();
		for(int i=0; i<(max*2); i++) {
			if(i<max)
				for(int j = 0; j<i; j++) {
					System.out.print("*");
				}
			else if(i==max) 
				for(int j=0; j<max; j++) {
					System.out.print("*");
				}
			else 
				for(int j=0; j<(max - (i-max)); j++) {
					System.out.print("*");
				}
			System.out.println("");
		}
		in.close();
	}

}
