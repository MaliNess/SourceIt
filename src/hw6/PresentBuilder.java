package hw6;

import java.util.Arrays;

public class PresentBuilder {

	public Sweet[] formPresent(Sweet... sweets) {
		Sweet[] present = sweets.clone();
		return present;
	}

	public double getPresentWeight(Sweet... sweets) {
		double overallWeight = 0;
		for (Sweet sweet : sweets) {
			overallWeight += sweet.getWeight();
		}
		return overallWeight;
	}

	public Sweet[] findCandyBySugar(double min, double max, Sweet... sweets) {
		return Arrays.stream(sweets).filter(sweet -> (sweet.getSugarAmount() >= min && sweet.getSugarAmount() <= max))
				.toArray(Sweet[]::new);
	}

	public Sweet[] findByContaint(String containt, Sweet... sweets) {
		return Arrays.stream(sweets)
				.filter(sweet -> (sweet.getMaterial().equals(containt) || sweet.getToping().equals(containt)
						|| sweet.getFilling().equals(containt) || sweet.getElement().equals(containt)))
				.toArray(Sweet[]::new);
	}

	public void sortByWeight(Sweet... sweets) {
		for (int i = sweets.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sweets[j].getWeight() > sweets[j + 1].getWeight()) {
					Sweet tmp = sweets[j];
					sweets[j] = sweets[j + 1];
					sweets[j + 1] = tmp;
				}
			}
		}
	}
}
