package DesignPattern;

public class SingletonPatternmain
{
public static void main (String [] args)
{
	
	// instance wise  & Static Class 
	 /* instanceClassname reference =new instanceClass();
	  * 
	  * staticClassname reference = staticClassname.methodname();
	  * 
	  * */
	SingleTonPattern ob=SingleTonPattern.getname();
	ob.getname();
	SingleTonPattern obj=SingleTonPattern.getname();
	obj.getname();
	SingleTonPattern objj=SingleTonPattern.getname();
	objj.getname();
	
	
	System.err.println("1st time "+ob);
	System.err.println("2nd time "+obj);
	System.err.println("3rd time "+objj);
	
	

	
	SingletonPatternmain k=new SingletonPatternmain ();
	System.out.println("1.current class "+k);
	SingletonPatternmain j=new SingletonPatternmain();
	System.out.println("2.current class "+j);
	
}
}
