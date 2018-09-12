package hw10;

public class Part2 {

	public static void main(String[] args) {

		Spam s = new Spam();
		s.start();
		try {
			Thread.sleep(5000);
			s.pressEnter();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
