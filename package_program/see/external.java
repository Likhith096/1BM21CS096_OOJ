package see;


import java.util.Scanner;
import cie.internal;
import cie.student;

public class external extends internal {
	float marks2[]=new float[5];
	public external() {
		Scanner ss=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter Subject " + (i+1) + " External marks" );
			marks2[i]=ss.nextFloat();
		}
	}
	public void calc() {
		for(int i=0;i<5;i++) {
			System.out.println("Sum of Internal and External marks for Subject " + i+ " is " + (marks[i]+marks2[i]));
		}
	}
}
