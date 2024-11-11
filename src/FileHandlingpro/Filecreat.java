package FileHandlingpro;

import java.io.File;
import java.io.IOException;
public class Filecreat {

	public static void main(String[] args) {
		File ref =new File("D:\\java file\\Filehandling whole concept\\filehandling\\filepage\\text1.txt");
		 boolean a=ref.exists();
         System.out.println(a);
//		if(a == false) {
//		ref.mkdir();	
//			//ref.mkdirs();
//			
//			a=ref.exists();		
//			System.out.println("folder present "+ a);
			/*try {
			boolean b=ref.createNewFile();
				System.out.println("create file " +b);
			} catch (IOException e) {
				
				e.printStackTrace();
			}*/
		//}
			
			
		/*File ref1=new File ("D:\\\\java file\\\\Filehandling whole concept\\\\filehandling\\\\filepage\\\\text1.txt");
		ref1.delete();
		boolean c=ref1.exists();
		System.out.println(c);*/
			
			
			/*File ref2=new File("D:\\\\java file\\\\Filehandling whole concept\\\\filehandling\\\\filepage\\\\text2.txt");
		boolean d=	ref.renameTo(ref2);
		System.out.println("rename " +d);*/
			
			System.out.println("canexecute "+ref.canExecute());
			System.out.println("canwrite "+ref.canWrite());
			System.out.println("canread "+ref.canRead());
			
			
			File ref3=new File("D:\\\\java file\\\\Filehandling whole concept\\\\filehandling");
			String []e=ref3.list();
			for(int i=0;i<e.length;i++) {
				System.out.println("list "+e[i]);
			}
			
			for(String s:e) {
				System.out.println(s);
			}
	}

}
