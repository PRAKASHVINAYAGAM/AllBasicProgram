package DesignPattern;

public class DoubleCheckSingleTonPattern {

private static volatile DoubleCheckSingleTonPattern ref;
	
	private DoubleCheckSingleTonPattern () {}

	public static DoubleCheckSingleTonPattern anyMethodname() {
		if(ref==null) {
		    synchronized (DoubleCheckSingleTonPattern.class) {
		    	if (ref==null) {
		    		ref= new DoubleCheckSingleTonPattern();
		    	}
		    }
		}
		
		return ref;
	}
}
