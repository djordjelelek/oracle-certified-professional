package chapter_1_advanced_class_design;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ToSpring {
	String name = "Mark";
	int id = 2;
		
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE); //Apache Commons Lang
	}


	public static void main(String[] args) {
		ToSpring toSpring = new ToSpring();
		System.out.println(toSpring);

	}
}
