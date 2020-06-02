package chapter_1_advanced_class_design;

public class Equals {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("first");
		StringBuilder sb2 = new StringBuilder();
		sb.append("first");
		System.out.println(sb.equals(sb2)); //false
		sb2 = sb;
		System.out.println(sb.equals(sb2)); //true
		
		String s1 = "first";
		String s2 = "first";
		System.out.println(s1.equals(s2)); //true
		
		//also can use Apache Commons Lang
	}

}
