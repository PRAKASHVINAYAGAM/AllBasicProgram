package StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class StreamApi {

	public static void main(String[] args) {
		ArrayList <String>ref=new ArrayList<String>();
		ref.add("prakash ");
		ref.add("mohan ");
		ref.add("poovarason ");
		ref.add("senthil ");
		ref.add("surender ");
		ref.add("naveen ");
		ref.add("siva ");
		ref.add("sudhan ");
		ref.add("soundar ");
		ref.add("bharath ");
		ref.add("k7 ");
		LinkedList<Integer>ref1=new LinkedList<Integer>();
		ref1.add(1);
		ref1.add(2);
		ref1.add(3);
		ref1.add(4);
		ref1.add(5);
		ref1.add(6);
		ref1.add(7);
		ref1.add(8);
		ref1.add(9);
		ref1.add(10);
		//Array[] ref2=new Array[10];
		int []ref2=new int[10];
		ref2[0]=100;
		ref2[1]=200;
		ref2[2]=300;
		ref2[3]=400;
		ref2[4]=500;
		ref2[5]=600;
		ref2[6]=700;
		ref2[7]=800;
		ref2[8]=900;
		ref2[9]=1000;
		ref2[10]=1000;
		ref2[11]=1000;
		ref2[12]=1000;
		
	ref1.stream().filter(x->x>5).forEach(System.out::println);
	ref.stream().map(x->x.concat("fsd 5&6 ")).forEachOrdered(System.out::println);
	//ref.stream().flatMap(x->x.contains("k7 ")).forEach(System.out::println);
	//int[]rr=ref2.length.distinct().toArray();

	}

}
