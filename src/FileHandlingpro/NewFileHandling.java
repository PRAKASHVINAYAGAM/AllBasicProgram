package FileHandlingpro;


import java.io.*;




public class NewFileHandling {

	public static void main(String[] args) {
		
		
		//folder and file creation
		//  escape sequence
		File a=new File("D:\\java file\\newfile\\fsd.txt");
		//File a=new File("D:\\java file\\Filehandling whole conceptnewfile\\newfile1\\newfile2\\newfile3");
		//boolean a1=a.exists();
		//System.out.println("file aleady exists or not "+a1);
		/*if(a1==false) {
			a.mkdir();
			boolean b2=a.exists();
			System.out.println("folder created "+b2);
			}*/

		
		// File creation
		/*try {
			boolean ref=a.createNewFile();
			System.out.println("file is created "+ref);
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
		
		
		// file delete
	   /* a.delete();
		boolean c=a.exists();
		System.out.println(c);*/
		
		
		
		// file rename
		/*File newa=new File("D:\\\\java file\\\\newfile\\\\fsd56.txt");
		boolean rename =a.renameTo(newa);
		System.out.println("rename changed "+rename);*/
		
		
		// printing file name
		/*System.out.println("file name"+a.getName());
		System.out.println("file new name "+newa.getName());
		System.out.println("canexcute "+a.canExecute());
		System.out.println("canread "+a.canRead());
		System.out.println("canwrite "+a.canWrite());*/
		
		
		
		// Listing all files and folderas in a directory
		//File z=new File("D:\\\\java file");
		//String[] s=z.list();
		      //using for loop
		/*for(int i=0;i<z.length();i++) {
			System.out.println(s[i]);
		}*/
		     //using foreach loop
		 /*for(String ss:s) {
			 System.out.println(ss);
		 }*/
			 
		
		
		
		//only print files name
		File z=new File("D:\\\\java file");
		File [] ff=z.listFiles();
		for(File f:ff) {
			//if(f.isFile())
			//if(f.isDirectory())
			if(z.isFile()) {
				String g=z.getName();
				int lastdot=g.lastIndexOf(".");
				String extension =g.substring(lastdot+1);
				if(extension.equals("txt"))
				System.out.println(extension);
		}
		
		}
		// size 
		if(z.length()>100000) {
			System.out.println(z+"size :"+z.length());
		}

	}}
