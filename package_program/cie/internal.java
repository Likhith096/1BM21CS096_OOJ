package cie;

import java.util.Scanner;
import cie.student;
public class internal extends student {  
	protected float marks[]=new float[5];
	public internal() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter Subject " + (i+1) + " Internal marks" );
			marks[i]=sc.nextInt();
		}
	}
}