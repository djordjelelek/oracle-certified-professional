package chapter_1_advanced_class_design.nasted_class;

public class LocalInerClass {
	private int i = 5;

	public void method() {
		final int f = 4;
		class Inner { // dont have acess modifier
			public void print() {
				System.out.println(i + f); //acess only final or effect final fields
				//cant static M/F
			}
		}
		Inner i = new Inner();
		i.print();
	}

	public static void main(String[] args) {
		LocalInerClass l = new LocalInerClass();
		l.method();
	}

}
