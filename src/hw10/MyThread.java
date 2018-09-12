package hw10;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Thread has been unterrupted.");
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
