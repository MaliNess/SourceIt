package hw10;

public class DemoCounter {
	public static void main(String[] args) {

		Counter c1 = new Counter();
		Counter c2 = new Counter();

		System.out.println("Unsynchronized" + System.lineSeparator());
		CounterThread ct1 = new CounterThread("1", c1);
		CounterThread ct2 = new CounterThread("2", c1);
		CounterThread ct3 = new CounterThread("3", c1);
		CounterThread ct4 = new CounterThread("4", c1);
		CounterThread ct5 = new CounterThread("5", c1);

		try {
			ct1.start();
			ct2.start();
			ct3.start();
			ct4.start();
			ct5.start();
			ct1.join();
			ct2.join();
			ct3.join();
			ct4.join();
			ct5.join();
		} catch (InterruptedException e) {
			System.out.println("has been interrupted");
		}

		System.out.println(System.lineSeparator() + "Synchronized" + System.lineSeparator());
		CounterSynchronizedThread cst1 = new CounterSynchronizedThread("1", c2);
		CounterSynchronizedThread cst2 = new CounterSynchronizedThread("2", c2);
		CounterSynchronizedThread cst3 = new CounterSynchronizedThread("3", c2);
		CounterSynchronizedThread cst4 = new CounterSynchronizedThread("4", c2);
		CounterSynchronizedThread cst5 = new CounterSynchronizedThread("5", c2);

		try {
			cst1.start();
			cst2.start();
			cst3.start();
			cst4.start();
			cst5.start();
			cst1.join();
			cst2.join();
			cst3.join();
			cst4.join();
			cst5.join();
		} catch (InterruptedException e) {
			System.out.println("has been interrupted");
		}
	}
}
