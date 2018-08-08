package hw3;

import java.util.Scanner;

public class ModMatrix {

	static void TMatrix(String[][] matrix) {
		String temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	static void VerticalMirror(String[][] matrix) {
		String temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
	}

	static void HorizontalMirror(String[][] matrix) {
		String temp;
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - 1 - i][j];
				matrix[matrix.length - 1 - i][j] = temp;
			}
		}
	}

	static void rotate90(String[][] matrix) {
		TMatrix(matrix);
		VerticalMirror(matrix);
	}

	static void rotate180(String[][] matrix) {
		VerticalMirror(matrix);
		HorizontalMirror(matrix);
	}

	static void rotate270(String[][] matrix) {
		TMatrix(matrix);
		HorizontalMirror(matrix);
	}

	static void outputMatrix(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		boolean error = false;

		System.out.println("Input size of the matrix:");
		int size = in.nextInt();
		String[][] matrix = new String[size][size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Integer.toString(i) + "." + Integer.toString(j);
			}
		}

		System.out.println("Choose rotate degrees:\n\t1 - 90\n\t2 - 180\n\t3 - 270");
		int mode = in.nextInt();

		System.out.println("\nBase matrix:\n");
		outputMatrix(matrix);
		System.out.println();

		switch (mode) {
		case 1:
			System.out.println("90 degrees rotated:\n");
			rotate90(matrix);
			break;
		case 2:
			System.out.println("180 degrees rotated:\n");
			rotate180(matrix);
			break;
		case 3:
			System.out.println("270 degrees rotated:\n");
			rotate270(matrix);
			break;
		default:
			System.out.println("You selected  non-existent mode!");
			error = true;
		}

		if (!error)
			outputMatrix(matrix);

		in.close();
	}

}
