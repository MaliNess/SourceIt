package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		// max in array demo
		System.out.print("Input array: ");
		String input = in.nextLine();
		String[] split = input.split(" ");
		int[] ar = new int[split.length];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = Integer.parseInt(split[i]);
		}

		System.out.println("Max number in array " + Arrays.toString(ar) + " is: " + findMax(ar) + ".");

		// rectangle demo
		System.out.println();
		System.out.print("Input height and width of rectangle: ");
		int h = in.nextInt();
		int w = in.nextInt();

		drawRectangle(h, w);

		// number of words in sentence demo
		System.out.println();
		System.out.print("Input sentence: ");
		input = in.next();
		input += in.nextLine();

		System.out.println("Sentence\n\t" + input + "\nhas " + numberOfWords(input) + " word(s).");

		// words with more than 3 letters
		System.out.println();
		System.out.print("Input words: ");
		input = in.next();
		input += in.nextLine();

		System.out.println("From words\n\t" + input + "\nmore than 3 letters has(ve) word(s)\n\t"
				+ Arrays.toString(moreThan3Letters(input)) + ".");
		
		in.close();
	}

	private static int findMax(int[] array) {
		// Way #1
		return Arrays.stream(array).max().getAsInt();

		//Way #2
		// int max=Integer.MIN_VALUE;
		// for(int i=0; i<array.length; i++) {
		// if(array[i]>max) max = array[i];
		// }
		// return max;
	}

	private static void drawRectangle(int height, int width) {
		//full rectangle
		System.out.println("Full rectangle:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		//borders
		System.out.println("\nBorders:");
		for(int i = 0; i<height; i++) {
			for(int j = 0; j<width; j++) {
				if(i!=0 && i!=height-1) {
					if(j==0 || j==width-1) System.out.print("+");
					else System.out.print(" ");
				}
				else System.out.print("+");
			}
			System.out.println();
		}
	}

	private static int numberOfWords(String s) {
		return s.split("[ ,.-:;]").length;
		
	}

	private static String[] moreThan3Letters(String s) {
		String[] split = s.split("[ ,.-:;]");
		return Arrays.stream(split).filter(str -> str.length() > 3).toArray(String[]::new);
	}

}
