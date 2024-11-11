package One;

public class OuterClass {
	private int c = 10;
	static int y = 20;

	
 class InnerSideClass{
	 
	 void get1() {
		 System.out.println("get1 " +c +" "+y);
	 }
 }
 
 
 
	public static void main(String[] args) throws Exception {
		OuterClass obj=new OuterClass();
  OuterClass.InnerSideClass kk=obj.new InnerSideClass();
  // outerclass.innerclass ref.name=outerclassref.name new innerclass();
  InnerSideClass ll=obj.new InnerSideClass();
   //innerclass ref.name = outerclassref.name new innerclass ();
kk.get1();
ll.get1();
try {
	int h=9;
	
	 int f=0;
//f=19;
	int u=h/f;
	System.out.println("try");
}
catch(Exception e){
	System.out.println("catch");
	
	throw new ArithmeticException("k");
}
finally {
	System.out.println("finally 1");
}
//finally {
//	System.out.println("finally 2");
//}
	}
	interface ff{
		default void sub() {
			System.out.println("ff default");
		}

		static void mul() {
			System.out.println("ff static");
		}
//		void divi() {
//			System.err.println("ff coid method ");
//		}
	}
	interface jjj{
		void kk();
	}
	@FunctionalInterface
	interface jj extends ff{
		void add();
	}
	
}













//
//interface book{
//	class page{
//		
//	}
//}
//class head{
/*	interface InnerSideinterface {
int a = 10;
// int b;
void get();

void set();
}
//}*/