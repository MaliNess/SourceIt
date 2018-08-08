package hw3;

import java.util.Arrays;
import java.util.Random;

public class DoubleArray {

	static void outputMas (int[] mas) {
		for(int i=0; i<mas.length; i++) System.out.print(mas[i] + "\t");
	}
	
	static void outputMas (int [] mas, int bound) {
		for(int i=0; i<mas.length; i++) {
			System.out.print(mas[i] + "\t");
			if(i==bound-1) System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] mas = new int[10];
		for(int i = 0; i<mas.length; i++) 
			mas[i] = r.nextInt(Integer.MAX_VALUE/2);
		outputMas(mas);
		System.out.println("\n");
		int[] copiedMas = Arrays.copyOf(mas, mas.length*2);
		for(int i = mas.length; i<copiedMas.length; i++) 
			copiedMas[i] = 2*mas[i - mas.length];
		outputMas(copiedMas, mas.length);
	}

}
