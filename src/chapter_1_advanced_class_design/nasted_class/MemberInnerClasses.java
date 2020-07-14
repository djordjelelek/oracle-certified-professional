package chapter_1_advanced_class_design.nasted_class;

public class MemberInnerClasses {
	private int i;

	public void method() {

	}

	protected class InnerClass {
		private int i2;

		public void method2() { // all acess, can extends AC/implements I, can be abstract or final

			i = i2;
			// cannot declare static F/M
		}

	}

}
