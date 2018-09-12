package hw10;

public class DemoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		MyThread t = new MyThread("MyThread");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.printf("%s has been interrupted", t.getName());
		}
		long finish = System.currentTimeMillis();
		long timeConsumedMillis = finish - start;
		System.out.println("Time: " + timeConsumedMillis + System.lineSeparator());

		start = System.currentTimeMillis();
		Thread t2 = new Thread(new MyThread2(), "MyThread2");
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			System.out.printf("%s has been interrupted", t.getName());
		}
		finish = System.currentTimeMillis();
		timeConsumedMillis = finish - start;
		System.out.println("Time: " + timeConsumedMillis + System.lineSeparator());
	}

}
