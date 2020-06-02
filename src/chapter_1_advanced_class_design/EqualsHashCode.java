package chapter_1_advanced_class_design;

public class EqualsHashCode {
	int i;
	String s;

	public EqualsHashCode(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}

	@Override //it must be
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override //it must be
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashCode other = (EqualsHashCode) obj;
		if (i != other.i)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}

	public static void main(String[] args) {
		EqualsHashCode hc = new EqualsHashCode(1, "");
		EqualsHashCode hc2 = new EqualsHashCode(1, "");
		EqualsHashCode hc3 = new EqualsHashCode(2, "");
		System.out.println(hc.hashCode() == hc2.hashCode()); //true
		System.out.println(hc.hashCode() == hc3.hashCode()); //false
		System.out.println(hc.hashCode()); //992
		System.out.println(hc2.hashCode()); //992
		System.out.println(hc3.hashCode()); //1023
		System.out.println(hc.equals(hc2)); //true
		System.out.println(hc.equals(hc3)); //false
		//equal instances have the same hash code
		//equal hash code doesn`t mean that they have equal instances
		
	}

}
