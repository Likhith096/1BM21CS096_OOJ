import java.util.*;
class account
{
 String cname,accno;
 int acc_type;
 double balance=0,dep,withdraw;
 
 void set()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your name and account number");
 cname=sc.nextLine();
 accno=sc.nextLine();
 System.out.println("Enter your balance");
 balance=sc.nextDouble();
 System.out.println("The balance is "+ balance);
}

void check()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("choose the type of account to withdraw from \n 1. Savings Account \n 2. Current Account");
 acc_type=sc.nextInt();
}
}//End of Bank class -- contained set and check


class curr_account extends account
{
 double minbal , penalty = (0.2)*minbal;
 Scanner sc = new Scanner(System.in);
curr_account(){minbal=1000.0;};
void penalty()
{
 if(balance<minbal)
{
 System.out.println("A penalty of "+penalty+"will be charged as the balance is below "+minbal+"\n Enter 1. To continue Enter 2.To cancel");
 int n=sc.nextInt();
 if(n==1)
 balance-=penalty;
 else
 System.out.println("Withdrawal Cancelled");
}
}

void deposit()
{
 System.out.println("Enter the deposit amount");
 dep=sc.nextDouble();
 balance+=dep;
 display();
}

void withdrawal()
{
 System.out.println("Enter the withdrawal amount");
 withdraw=sc.nextDouble();
 if(withdraw<balance)
{
 balance-=withdraw;
}
else
 System.out.println("Imsufficient funds!");
display();
}

void display()
{
 penalty();
System.out.println("Name: "+cname +"Account number: "+accno);
System.out.println("The balance in the account is"+balance);
}
}//end of curr_account class


class sav_account extends account
{
  Scanner sc = new Scanner(System.in);
void intrest()
	{	
		double r,n,t;
		Scanner sc= new Scanner(System.in);
  		System.out.println("Enter the rate of interest ");  
  		r = sc.nextDouble();
		System.out.println("Enter the number of times interest is compounded per year ");  
  		n = sc.nextDouble();
		System.out.println("Enter the time in years ");  
  		t = sc.nextDouble();
  		balance=balance*Math.pow((1+r/n),(n*t));
		System.out.println("A Compound interest was added");
		display();
 	}

void deposit()
{
 System.out.println("Enter the deposit amount");
 dep=sc.nextDouble();
 balance+=dep;
 display();
}

void withdrawal()
{
 System.out.println("Enter the withdrawal amount");
 withdraw=sc.nextDouble();
 if(withdraw<balance)
{
 balance-=withdraw;
}
else
 System.out.println("Imsufficient funds!");
display();
}

void display()
{
System.out.println("Name: "+cname +"Account number: "+accno);
System.out.println("The balance in the account is"+balance);
}
}//End of sav_class 


class Bank
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int op;
	account a = new account();
	a.check();
	sav_account s = new sav_account();
    	curr_account c = new curr_account();
	System.out.println("The balance in the account is "+a.balance);
  	if(a.acc_type==1)
	{
		s.set();
  		while(true)
		{
			System.out.print("Enter the choice: \n1. Display\n2. Deposit\n3. Withdraw\n4. Compound Intrest\n5. Exit\n");
			op=sc.nextInt();
			switch(op)
			{
			case 1:s.display();
 				break;
			case 2:s.deposit();
 				break;
			case 3:s.withdrawal();
 				break;
			case 4:s.intrest();
 				break;
			case 5:System.exit(0);
			default: System.out.println("Wrong choice ");
		}
   		}
  	}
 	else if(a.acc_type==2)
	 {    
		c.set();
  		while(true)
		{
		System.out.print("Enter the choice: \n1. Display\n2. Deposit Check\n3. Withdraw Check\n4. Exit\n");
		op=sc.nextInt();
		switch(op)
		{
		case 1:c.display();
 			 break;
		case 2:c.deposit();
 			break;
		case 3:c.withdrawal();
 			break;
		case 4:System.exit(0);
		default: System.out.println("Wrong choice ");
		}
  		}
  	}
 	else{
  	 System.out.println("Wrong choice ");
  	}
 }
}

 
 