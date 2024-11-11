package AllPrograms;

import java.util.Arrays;

public class Anagrams {
	
	public static void main (String [] args) {
		
		String s1="cat";
		String s2= "actw";
		
		char [] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
//		for (char c3:c1) {
//			System.out.println(c3);
//		}
//		for (char c4:c2) {
//			System.out.print(c4);
//		}
//		
//		
//		int i1=s1.length();
//		int i2=s2.length();
//		
//		System.out.println(i1);
//		System.out.println(i2);
//		
//		if (i1==i2) {
//			 System.out.println("both string  length should be same");
//			
//		}
//		else {
//			System.out.println("both string length should not be same ");
//		}
		
		//sort
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b1=Arrays.equals(c1, c2);
		if (b1==true) {
			System.out.println("both string are anagram");
		}
		else {
			System.out.println("both string not anagram");
		}
		System.out.println();
		
	}

}
