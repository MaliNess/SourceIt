package hw10;

public class CounterSynchronizedThread extends Thread {
	private Counter c;

	public CounterSynchronizedThread(String name, Counter c) {
		super(name);
		this.c = c;
	}

	public void run() {
		synchronized (c) {
			if (c.i == c.j)
				System.out.printf("Вывод потока %s: i (%d) = j (%d)" + System.lineSeparator(),
						Thread.currentThread().getName(), c.i, c.j);
			else if (c.i > c.j)
				System.out.printf("Вывод потока %s: i (%d) > j (%d)" + System.lineSeparator(),
						Thread.currentThread().getName(), c.i, c.j);
			else
				System.out.printf("Вывод потока %s: i (%d) < j (%d)" + System.lineSeparator(),
						Thread.currentThread().getName(), c.i, c.j);
			c.i += 1;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Thread has been unterrupted.");
			}
			c.j += 1;
		}
	}
}
