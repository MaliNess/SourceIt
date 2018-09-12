package hw10;

import java.util.Random;

public class Matrix {

	public static void main(String[] args) {
		int[][] m = new int[4][100];
		Random r = new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextInt(100);
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}

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
		
		max = m[0][0];
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] > max) max = m[i][j];
			}
		}
		
		System.out.println("Standart max: " + max);
	}

}
