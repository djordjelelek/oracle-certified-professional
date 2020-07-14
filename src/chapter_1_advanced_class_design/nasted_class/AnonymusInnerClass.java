package chapter_1_advanced_class_design.nasted_class;

public class AnonymusInnerClass {
	private int i = 1;
	abstract class A{
		abstract public void method();
	}
	public void m() {
		A a = new A() { //extends AC/implements I
			public void method() {
				System.out.println("print");
			}
			//can acess final or effectively final
		}; //semicolon
	}

}
