package FileHandlingpro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


abstract class add{
	void ad() {
		System.out.println("sys");
	}
	
}



public class ReadWrite extends add{
//	void ad() {
//		System.out.println("ad");
//	}
void sub() {
	System.out.println("sun");
}
	public static void main(String[] args) throws IOException  {
		File ref=new File("D:\\java file\\Filehandling whole concept\\filehandling\\java\\");
try {
	boolean a=ref.createNewFile();
	System.out.println("file "+a);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		add tt=new ReadWrite();
		tt.ad();
		ReadWrite jj=new ReadWrite();
		jj .sub();
		try {
			FileWriter a=new FileWriter(ref);
			BufferedWriter b=new BufferedWriter(a);
			b.write("java");
			b.newLine();
			b.write("fsd");
			b.newLine();
			b.write(65);
			b.newLine();
			b.write(66);
			b.flush();
			b.close();
			System.out.println("successful");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader c=new FileReader(ref);
			BufferedReader d=new BufferedReader(c);
			//String s=d.readLine(); 
			int  ss=d.read();
			while (ss!= -1) {
				System.out.println(ss);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

}
