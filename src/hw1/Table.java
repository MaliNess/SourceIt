package hw1;

import java.util.Scanner;

public class Table {

	public static String digit2char(int num) {
		int temp = num, count=0;
		String d="";
		
		while(temp>26) {
			temp/=26;
			count++;
		}
		count++;
		
		char[] arr = new char[count];
		temp=num;
		
		for(int i = 0; i<arr.length; i++) {
			if(temp%26 == 0) {
				arr[arr.length-1-i] = 'Z';
				temp--;
			}
			else arr[arr.length-1-i] = (char)(temp%26 + 64);
			temp/=26;
		}
		for(int i = 0; i<arr.length; i++) {
			d+=Character.toString(arr[i]);
		}
		return (d);
	}
	
	public static int char2digit(String s) {
		char[] CharArray = s.toCharArray();
		int sum=0;
		for(int i=0; i<CharArray.length; i++){
			sum += ((int)CharArray[i]-64) * Math.pow(26,(CharArray.length - 1 - i));
		}
		return(sum);
	}
	
	public static String rightColumn(String s) {
		int temp = char2digit(s);
		temp++;
		String res = digit2char(temp);
		return (res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choise=1, mode;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Choose mode:\n\t1 - Char to digit\n\t2 - Digit to Char\n\t3 - Show right column");
			mode = in.nextInt();
			switch(mode) {
				case 1: System.out.println("Input coulumn number in latin capital letter(s) (ex. A, GH...)");
						System.out.println("Result: " + char2digit(in.next()));
						break;
				case 2: System.out.println("Input coulumn number in digits (ex. 1, 23...)");
						System.out.println("Result: "+ digit2char(Integer.parseInt(in.next())));
						break;
				case 3: System.out.println("Input coulumn number in latin capital letter(s) (ex. A, GH...)");
						System.out.println("Result: "+ rightColumn(in.next()));
						break;
				default: System.out.println("Wrong input!");
			}
			System.out.println("Wanna try again? Input 0 to finish.");
			choise = in.nextInt();
		}while(choise!=0);
		in.close();
	}

}
