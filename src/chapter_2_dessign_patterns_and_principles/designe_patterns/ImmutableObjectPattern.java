package chapter_2_dessign_patterns_and_principles.designe_patterns;

import java.util.ArrayList;
import java.util.List;



public final class ImmutableObjectPattern {
	private final int field;
	private final List<String> list;

	public ImmutableObjectPattern(int field, List<String> list) {
		super();
		this.field = field;
		if (list == null) {
			throw new RuntimeException("!!");
		}
		this.list = new ArrayList<String>(list); //!!!
	}

	public int getField() {
		return field;
	}

//	public List<Integer> getList() {  //dont do this, because refeerenced mutable object can change, if someone override this method
//		return list;
//	}
	public String getListItem(int index) { // this is better
		return list.get(index);
	}

}
