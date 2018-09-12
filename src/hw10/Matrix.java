package hw10;

import java.util.Random;

public class Matrix {

	public static void main(String[] args) {
		int[][] m = new int[4][1000];
		Random r = new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextInt(1000);
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}

		long start = System.currentTimeMillis();
		MatrixThread mt1 = new MatrixThread(m, 0);
		MatrixThread mt2 = new MatrixThread(m, 1);
		MatrixThread mt3 = new MatrixThread(m, 2);
		MatrixThread mt4 = new MatrixThread(m, 3);

		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();

		try {
			mt1.join();
			mt2.join();
			mt3.join();
			mt4.join();
		} catch (InterruptedException e) {

		}

		int max = mt1.max;
		if (mt2.max > max)
			max = mt2.max;
		else if (mt3.max > max)
			max = mt3.max;
		else if (mt4.max > max)
			max = mt4.max;

		System.out.println(System.lineSeparator() + "Threads max: " + max);
		long finish = System.currentTimeMillis();
		long timeConsumedMillis = finish - start;
		System.out.println("Time: " + timeConsumedMillis + System.lineSeparator());

		start = System.currentTimeMillis();
		max = m[0][0];
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				try {
					Thread.sleep(1);
				} catch(InterruptedException e) {
					System.out.println("Thread has been interrupted");
				}
				if(m[i][j] > max) max = m[i][j];
			}
		}
		
		System.out.println("Standart max: " + max);
		finish = System.currentTimeMillis();
		timeConsumedMillis = finish - start;
		System.out.println("Time: " + timeConsumedMillis + System.lineSeparator());
	}

}
