package chapter_2_dessign_patterns_and_principles.lambdas;

public class CityServices {
	String name;
	boolean broadwalk;
	boolean fountain;
	boolean onRiver;

	public CityServices(String name, boolean broadwalk, boolean fountain, boolean onRiver) {
		super();
		this.name = name;
		this.broadwalk = broadwalk;
		this.fountain = fountain;
		this.onRiver = onRiver;
	}

	public boolean isBroadwalk() {
		return broadwalk;
	}

	public boolean isFountain() {
		return fountain;
	}

	public boolean isOnRiver() {
		return onRiver;
	}

	@Override
	public String toString() {
		return "CityServices [name=" + name + "]";
	}

}
