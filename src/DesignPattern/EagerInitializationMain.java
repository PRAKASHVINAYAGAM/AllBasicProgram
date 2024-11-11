package DesignPattern;

public class EagerInitializationMain {

	public static void main (String []args) {
	EagerInitiliationSingleTonPattern obj=EagerInitiliationSingleTonPattern.anyMethodNmae();
	EagerInitiliationSingleTonPattern objj=EagerInitiliationSingleTonPattern.anyMethodNmae();
	
	System.out.println("the 1st eager initialization object " +obj);
	System.out.println("the  2nd eager initialization object " +objj);
	
}}
