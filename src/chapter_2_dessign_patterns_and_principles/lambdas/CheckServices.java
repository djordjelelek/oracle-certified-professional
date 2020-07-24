package chapter_2_dessign_patterns_and_principles.lambdas;

public class CheckServices {
	
	public static void print(CityServices cs, CityFunctionalInterface i) {
		if (i.test(cs)) System.out.println(cs);
		else System.out.println("!");
	}
}
