package One;

import java.io.File;
import java.io.IOException;

public class Readio {

	public static void main(String[] args) {
		File obj =new File("D:\\java file\\filehandling\\file.txt");
//		try {
//			obj.createNewFile();
//			
//		} catch (IOException e) {
//		
//			e.printStackTrace();
//		}
		System.out.println(obj.canWrite());
		System.out.println(obj.canRead());
		
		//character read and write
		//FileWrite a=new FileWrite ("");
		int a[]=new int[10];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		for(int i=0;i<3;i++) {
			System.out.println("hh"+a[i]);
		}
		a[3]=44;
		a[4]=55;
		for(int i=0;i<5;i++) {
			System.out.println("hh"+a[i]);
		}
	}

}
