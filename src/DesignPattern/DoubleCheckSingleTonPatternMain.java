package DesignPattern;

public class DoubleCheckSingleTonPatternMain {

	public static void main (String []args) {
	DoubleCheckSingleTonPattern object1=DoubleCheckSingleTonPattern.anyMethodname();
	DoubleCheckSingleTonPattern object2=DoubleCheckSingleTonPattern.anyMethodname();
	
	System.out.println("both are same "+ (object1==object2));
	}
}
