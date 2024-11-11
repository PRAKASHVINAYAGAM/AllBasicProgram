package DesignPattern;

public class SingleTonPattern
{
	
	// Lazy initialization
	
    private static  SingleTonPattern stp;
    
    private SingleTonPattern () {}
    
  public static SingleTonPattern getname() 
  {
	  if(stp==null)
	  {
		  stp=new SingleTonPattern();
	  }
	  return stp;
	  
  }
}



//System.out.println("k7 mohan");
//System.out.println("SingleTonPattern hi " + stp);