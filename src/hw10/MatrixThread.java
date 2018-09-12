package hw10;

public class MatrixThread extends Thread{
	public int max;
	private int[][] mt;
	private int row;
	
	
	public MatrixThread(int[][] mt, int row) {
		this.mt = mt;
		this.row = row;
	}
	
	public void run() {
		max = mt[row][0];
		for(int i = 0; i < mt[row].length; i++) {
			if(mt[row][i] > max) max = mt[row][i];
		}
	}
}
