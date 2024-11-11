package FileHandlingpro;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class newWeriteRead {

	public static void main(String[] args) {
		
// file writer class
		File obj=new File("D:\\java file\\uniq.txt");
		try {
			//obj.createNewFile();
			FileWriter obj1=new FileWriter(obj);
			obj1.write("65");
			obj1.flush();
			obj1.write("\n fsd");
			obj1.flush();
			obj1.write("java");
			obj1.flush();
			obj1.write(" \n salem");
			obj1.close();
			System.out.println("all write operations done ");
			
			// reader
			FileReader obj2=new FileReader(obj);
			int out=obj2.read();
			while(out!=-1) {
				System.out.print((char)out);
				out=obj2.read();
			}
			
			// read using array
			FileReader obj3=new FileReader(obj);
			char[] ch=new char [(int)obj.length()];
			System.out.println(ch.length);
			obj3.read(ch);
			for(char ch1:ch) {
				System.out.print(ch1);
			}
			System.out.println("read operation");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
