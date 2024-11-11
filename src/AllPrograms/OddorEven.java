package AllPrograms;

import java.util.Scanner;

public class OddorEven {
	
	public static void main (String []args) {
		
	Scanner scanner=new Scanner (System.in);
	System.out.println("enter the value");
	int b= scanner.nextInt();
		
		if(b%2==0) {
		System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
