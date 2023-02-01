package Araaysprts;

import java.util.Scanner;
//Programe is for checke Even_odd_number in java
public class CheckEvenOdd {
	public static void main(String[]args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number to check odd even");
		int number=inp.nextInt();
		
		if(number%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
		
		
	}

}
