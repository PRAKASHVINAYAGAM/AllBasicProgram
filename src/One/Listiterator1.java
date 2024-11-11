package One;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Listiterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> o=new ArrayList<String>();	
o.add("one");
o.add("two");
o.add("three");
ListIterator<String> ob =o.listIterator();
System.out.println("forward");
while(ob.hasNext()) {
	System.out.println(ob.next());
	//o.add("four");
	
}
System.out.println("-------------");
System.out.println("backword");
while(ob.hasPrevious()) {
	System.out.println(ob.previous());
	
}

List <String> obj=new CopyOnWriteArrayList<>();
obj.add("p");
obj.add("r");
obj.add("a");
obj.add("k");

System.out.println("obj"+obj);
obj.remove(0);
obj.remove(1);
obj.set(0,"f");
System.out.println(obj);

for(String jj:obj) {
	System.err.println(jj);
}
	}

}
