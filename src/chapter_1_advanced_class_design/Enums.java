package chapter_1_advanced_class_design;

public class Enums {
	// finite set of values
	public enum Season {
		WINTER, SPRING, SUMMER, FALL;
		private Season() {
			System.out.println("constructor"); // when you call one time, all values are formed,
												// and this will print only one time
		}
	}

	public enum Months {
		JANUARY {
			public void days() {
				System.out.println("31");
			}
		}, // comma
		FEBRUAR {
			public void days() {
				System.out.println("28");
			}
		},
		MARCH, JUNE;// semicolon
		public void days() {
			System.out.println("default");
		}
	}

	public static void main(String[] args) {
		Season s = Season.SPRING;
		System.out.println(s);
		System.out.println(Season.SUMMER);
		System.out.println(s == Season.FALL);

		for (Season s1 : Season.values()) {
			System.out.println(s1.name() + s1.ordinal() + s1.hashCode()); // some functions
		}

		switch (s) {
		case WINTER:
			System.out.println("winter");
			break;
		default:
			System.out.println("all others");
		}

	}

}
