package DesignPattern;

public class ThreadSingleTonPattern {
	
	private static ThreadSingleTonPattern ref;
	
	private ThreadSingleTonPattern () {}
	
	public static synchronized ThreadSingleTonPattern anyMethodName() {
		
		if(ref==null) {
			ref=new ThreadSingleTonPattern();
		}
		
		return ref;
	}

}
