package hw8;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Random r = new Random();
		for(int i =0; i< arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		System.out.println("Base: " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted: " + Arrays.toString(arr));
	}

}
