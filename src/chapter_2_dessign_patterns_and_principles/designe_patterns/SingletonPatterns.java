package chapter_2_dessign_patterns_and_principles.designe_patterns;

public class SingletonPatterns {
	private int min = 0;
	private SingletonPatterns() {} //private constructor, cant create an instance
	
	//public static final SingletonPatterns sp = new SingletonPatterns(); //can create like a field
	private static volatile SingletonPatterns sp;
	
//	public static synchronized SingletonPatterns createWhenFirstCall() {
//		if (sp == null) sp = new SingletonPatterns();
//		return sp;
//	}
	public static synchronized SingletonPatterns createWhenFirstCall() { //dont do synchronization all time when we call method
		if (sp == null) {
			synchronized (SingletonPatterns.class) {
				if (sp == null) {
					sp = new SingletonPatterns();
				}
			}
		}
		return sp;
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public SingletonPatterns getSp() {
		return sp;
	}
	
	


}
