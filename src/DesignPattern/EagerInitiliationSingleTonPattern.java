package DesignPattern;


public class EagerInitiliationSingleTonPattern {

	private static EagerInitiliationSingleTonPattern ref= new EagerInitiliationSingleTonPattern();
			
	private EagerInitiliationSingleTonPattern() {}
	
	public static EagerInitiliationSingleTonPattern anyMethodNmae() {
		return ref;
	}	
}
