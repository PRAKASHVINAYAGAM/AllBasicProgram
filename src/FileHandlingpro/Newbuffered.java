package FileHandlingpro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Newbuffered {

	public static void main(String[] args) throws IOException {
		

		File obj=new File ("D:\\java file\\newbuffered\\buffered.txt");
		obj.createNewFile()	;
		System.out.println("file created");
		
		
		//writer and reader
		FileWriter obj1=new FileWriter(obj,true);
		BufferedWriter obj2=new BufferedWriter(obj1);
		obj2.write("java independed language.simple.");
		obj2.newLine();
		obj2.write("python depended language.simple.");
		obj2.newLine();
		obj2.write("c depended language.simple.");
		obj2.newLine();
		obj2.write(" c++ depended language.simple.");
		obj2.newLine();
		obj2.flush();
		obj2.close();
		System.out.println("writer operation done");
		
		// read 
		FileReader obj3=new FileReader(obj);
		BufferedReader obj4=new BufferedReader(obj3);
		String line =obj4.readLine();
		int linecount=0;
		int sentencecount=0;
		int wordcount=0;
		int charcount=0;
		while(line!=null) {
			// sentence count
			String []sentence=line.split("language");
			sentencecount=sentencecount +sentence.length;
			System.out.println(line);
			
			String[] words=line.split(" ");
			wordcount=wordcount+words.length;
			
			// char count
			charcount=charcount+line.length();
			
			//line count
			linecount++;
			System.out.println(line);
			line=obj4.readLine();
		}
		System.out.println("no of line count is ="+linecount);
		System.out.println("no of sentence is = "+sentencecount);
		System.out.println("no of words count ="+wordcount);
		System.out.println("no of char count ="+charcount);
		}

}
