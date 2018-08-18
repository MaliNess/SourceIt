package hw8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TextEditor {

	public static void writeFile(File fp) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter(fp, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			Scanner inCons = new Scanner(System.in);
			inCons.useDelimiter("\\s");

			String temp = inCons.nextLine();

			while (true) {
				if (Arrays.stream(temp.split(" ")).filter(word -> word.toLowerCase().equals("exit"))
						.toArray(String[]::new).length != 0) {
					for (String string : temp.split(" ")) {
						if (string.toLowerCase().equals("exit"))
							break;
						else
							pw.print(string + " ");
					}
					break;
				} else {
					pw.print(temp + System.lineSeparator());
					temp = inCons.nextLine();
				}
			}
			inCons.close();
		} catch (IOException e) {
			System.out.println("Error occured when opening stream " + e);
		} finally {
			if (pw != null) {
				try {
					pw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void getFileInfo(File fp) {

		BufferedReader br = null;
		try {
			int length = 0;
			int words = 0;
			String vowels = "";
			int max = 0;
			br = new BufferedReader(new FileReader(fp));
			System.out.println(System.lineSeparator() + "In file: ");
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
				length += tmp.length();
				words += tmp.split("\\s").length;
				if (countVowels(tmp) > max) {
					vowels = tmp;
					max = countVowels(tmp);
				}
			}
			System.out.println(System.lineSeparator() + "Length: " + (length - 1));
			System.out.println(System.lineSeparator() + "Number of words: " + words);
			System.out.println(System.lineSeparator() + "String with most vowels: " + vowels);
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
	}

	private static int countVowels(String s) {
		char[] charArray = s.toCharArray();
		char[] vowels = { 'e', 'u', 'i', 'o', 'a', 'E', 'U', 'I', 'O', 'A' };
		int counter = 0;
		for (char c : charArray) {
			for (char v : vowels) {
				if (c == v)
					counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("res.txt");
		if (f.exists())
			f.delete();
		try {
			if (f.createNewFile()) {
				System.out.println("File created!");
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		writeFile(f);
		getFileInfo(f);
	}

}
