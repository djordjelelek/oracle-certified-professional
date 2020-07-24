package chapter_2_dessign_patterns_and_principles.lambdas;

public class mainClass {

	public static void main(String[] args) {
		CityServices cs1 = new CityServices("Rogatica", true, true, true);
		CityServices cs2 = new CityServices("Sokolac", false, false, false);
		CheckServices.print(cs1, cs -> cs.fountain);
		CheckServices.print(cs2, (CityServices cs) -> {
			return cs.fountain;
		});

	}

}
