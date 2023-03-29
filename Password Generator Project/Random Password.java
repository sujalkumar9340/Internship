//Password Generator in java 
import java.util.Random;
import java.util.Scanner;

public class password_Generator {
	public static void main(String[] args) {
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lowercase = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialchar = "!@#$%^&*()?><}{[]";
		String combination = uppercase + Lowercase + num + specialchar; // combining all the charactar in combination
																		// variable
		System.out.println("Enter the size of password that  you need\n not greater than 16");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Random rand = new Random(); // random is class inside the java..util.package
//            String genetaated_password=new String(password);
	    char []password=new char[size];
	   
	    for(int i=0;i<size;i++) {
	    	password[i]=combination.charAt( rand .nextInt(combination.length()));
	    }
	    String genetaated_password=new String(password);
	    System.out.println("THIS IS YOUR PASSWORD:- "+ genetaated_password);
	    if(size<=8) {
	    	System.out.println("very week password");
	    }
	    else if(size>8&size<10) {
	    	System.out.println("weak password");
	    }
	    else if(size>10&size<=12) {
	    	System.out.println("medium strngth password");
	    }
	    else if( size>12&size<16) {
	    	System.out.println("password is strong");
	    }
	    else if(size==16) {
	    	System.out.println("password is very strong");
	    }
	    
	
	
	}

}
