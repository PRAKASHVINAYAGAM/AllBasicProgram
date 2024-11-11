package One;

public class Runable1 implements Runnable  {
	public void run () {
		System.out.println("interface runnable");
	}
	static void add() {
		//int ss=10;
	}
public static void main (String [] args) {
	Runable1 ob1=new Runable1 ();
	Runable1 ob2=new Runable1 ();
	Runable1 ob3=new Runable1 ();
	ob1.run();
	ob2.run();
	ob3.run();
	//int gg=18;
	//File
	
}
}
