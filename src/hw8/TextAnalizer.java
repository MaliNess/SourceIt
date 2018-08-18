package hw8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextAnalizer {

	public static String readFile(File fp) {
		BufferedReader br = null;
		String s = "";
		String tmp = "";
		try {
			br = new BufferedReader(new FileReader(fp));
			while ((tmp = br.readLine()) != null) {
				s += tmp + System.lineSeparator();
			}
		} catch (IOException e) {
			System.out.println("Error occured when opening stream " + e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return s;
	}

	public static void countLetters(String s) {
		char[] charArray = s.toCharArray();
		char[][] let = new char[26][2];
		int[] num = new int[26];
		for (int i = 0; i < let.length; i++) {
			let[i][0] = (char) (i + 65);
			let[i][1] = (char) (i + 97);
			num[i] = 0;
		}
		for (char c : charArray) {
			for (int i = 0; i < let.length; i++) {
				if (c == let[i][0] || c == let[i][1])
					num[i]++;
			}
		}
		for (int i = 0; i < num.length - 1; i++)
			for (int j = 0; j < num.length - i - 1; j++)
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					char tmp1 = let[j][0];
					char tmp2 = let[j][1];
					num[j] = num[j + 1];
					let[j][0] = let[j + 1][0];
					let[j][1] = let[j + 1][1];
					num[j + 1] = temp;
					let[j + 1][0] = tmp1;
					let[j + 1][1] = tmp2;
				}
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0)
				System.out.printf(let[i][1] + "(" + let[i][0] + "): %d time(s)." + System.lineSeparator(), num[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("res.txt");

		countLetters(readFile(f));

	}

}
