package chapter_1_advanced_class_design.instance_of;

public class MainClass {
	
	public static void main(String[] args) {
		ParentClass child = new ChildClass();
		System.out.println(child instanceof ParentClass); //true
		//when writing a library that will be use by many others
		//java knows is class instance of another at the compile time 
	}

}
