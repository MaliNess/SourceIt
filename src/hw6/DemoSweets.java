package hw6;

import java.util.Arrays;

public class DemoSweets {

	public static void main(String[] args) {
		Sweet s1 = new Wafer("Bee", 10, 2, 15, "wafer", "caramel");
		Sweet s2 = new CandyWithToping("Rainbow", 12, 4, 20, "jelly", "chocolate");
		Sweet s3 = new CandyWithFilling("Night", 15, 6, 25, "chocolate", "almond");
		Sweet s4 = new Lollypop("Rooster", 50, 20, 10, "caramel");
		Sweet s5 = new Lollypop("Juicy Rooster", 40, 15, 30, "grape juice");

		PresentBuilder p = new PresentBuilder();
		Sweet[] present = p.formPresent(s1, s2, s3, s4, s5);
		System.out.println("All sweets in present:");
		System.out.println(Arrays.toString(present));
		System.out.println("=============================================");
		System.out.println("Weight of the present: " + p.getPresentWeight(present));
		System.out.println("=============================================");
		System.out.println("Sweets, which contains chocolate:");
		Sweet[] fbc = p.findByContaint("chocolate", present);
		System.out.println(Arrays.toString(fbc));
		System.out.println("=============================================");
		System.out.println("Sweets with the amount of sugar from 5 to 20 (including bounds):");
		Sweet[] fcbs = p.findCandyBySugar(5, 20, present);
		System.out.println(Arrays.toString(fcbs));
		System.out.println("=============================================");
		System.out.println("Present was sorted by sweets' weight:");
		p.sortByWeight(present);
		System.out.println(Arrays.toString(present));
	}

}
