package cie;
import java.util.Scanner;

public class student {  
	String sname=new String();
	String usn=new String();
	int sem;

	public student() {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter your name: ");
		sname=s.next();
		System.out.println("Enter your usn: ");
		usn=s.next();
		System.out.println("Enter your sem: ");
		sem=s.nextInt();
	}		
}