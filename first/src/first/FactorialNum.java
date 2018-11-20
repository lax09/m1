package first;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter a number");
		
		int n=sc.nextInt();
		System.out.println(n);
		
//	int n=5	;
	int i;
	for (i=1;i<n;i++)
		
	n=n*i;
		
	System.out.println(n);
	
	}

}
