package DesignPattern;

public class ThreadSingleTonMain 
{
	public static void main (String [] args) {
	ThreadSingleTonPattern refer= ThreadSingleTonPattern.anyMethodName();
	ThreadSingleTonPattern referr= ThreadSingleTonPattern.anyMethodName();
	
	System.out.println("both are same - " + (refer==referr));
}}
