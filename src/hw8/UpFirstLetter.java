package hw8;

import java.util.Scanner;

public class UpFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] words = input.split(" ");

		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
		}

		System.out.println(sb.toString());
		in.close();
	}

}
