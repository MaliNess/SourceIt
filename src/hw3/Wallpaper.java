package hw3;

import java.util.Scanner;

public class Wallpaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of blocks:");
		int blocks = in.nextInt();
		System.out.println("Input number of characters in a block:");
		int num = in.nextInt();
		System.out.println("Input heigth of the wallpaper:");
		int height = in.nextInt();

		boolean type = true;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < blocks; j++) {
				for (int l = 0; l < num; l++) {
					if(type) System.out.print("+");
					else System.out.print("*");
				}
				if(type) type = false;
				else type = true;
			}
			System.out.println("");
			type = true;
		}
		
		in.close();
	}

}
