package Functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
//@FunctionalInterface
//interface ff{
// static void dd() ;
//		
//}
//abstract class yy{
//	
//	final  void uu() {
//		System.out.println();
//	}
//}
public class predefineFunctional {

	public static void main(String[] args) {
		
		//Predicate (test= >return is boolean false or true)
      Predicate<Integer>ref=a->(a>18 );
      System.out.println(ref.test(26));
      
      
      //Function  (apply=> returns is value like ..String,integer,......)
      String b="prakash";
      Function <String,String>ref1=a->(a.concat(b));
      System.out.println(ref1.apply("prakash"));
      
      //Consumer  (accept=> void method (non return method) )
      Consumer <Integer>ref2=a->System.out.println("accept "+a);;
      ref2.accept(12);
      
      
      //supplier (returns value String or integer or float or double or char.....)
     Supplier <Integer> ref3=()-> 12;
     int d=ref3.get();
     System.out.println(d);
     
     
     //BiPredicate 
     BiPredicate <Integer,Integer>ref4= (a, g)->a + g >20;
     System.out.println("result 1 = "+ref4.test(5,8));
     System.out.println("result 2 = "+ref4.test(14, 15));
     
     // Bifunction
     BiFunction <Integer,Integer,String>ref5=(a,c)->"result"+(a*c);
     String Result1=ref5.apply(2, 4);
     System.out.println(Result1);
     
     // BiConsumer 
     BiConsumer <Integer,Integer> ref6=(a,j)->System.out.println(a+" integer "+j);
     ref6.accept(7, 8);
     
     
     
	}

}
