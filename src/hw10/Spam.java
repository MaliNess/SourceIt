package hw10;

public class Spam extends Thread {

	private static long[] mil;
	private static String[] mes;
	private static boolean isPressed = false;

	static {
		mil = new long[20];
		mes = new String[20];
		for (int i = 0; i < 10; i++) {
			mil[i] = 1000 + 500 * i;
			mes[i] = "Message " + i;
		}
	}

	public void run() {
		int i = 0;
		while (!isPressed) {
			try {
				Thread.sleep(mil[i]);
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrupted.");
			}
			System.out.println(mes[i]);
			i++;
			if (i == 20)
				i = 0;
		}

	}

	public static void pressEnter() {
		isPressed = true;
	}

}
