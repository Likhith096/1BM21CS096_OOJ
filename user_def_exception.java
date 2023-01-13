import java.util.*;
class NegativeAge extends Exception //All udf extends exception class
{
 String msg = new String();
 NegativeAge(String s)//Inputing the passed string for this exception
{
 msg=s;
}
 public String toString(){ //converting to string format
 return msg;
}
}

class WrongAgeDiff extends Exception
{
 String msg = new String();
 WrongAgeDiff(String s)
{
 msg=s;
}
public String toString(){ return msg;}
}

class Father{
int f_age;
Father() throws NegativeAge //We have to indicate that it is throwing as we haven't used catch block here
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Father's age");
 f_age = sc.nextInt();
 if(f_age<0)
 throw new NegativeAge("The entered age is negative!");
}
}

class Son extends Father{
int s_age;
Son() throws NegativeAge
{
 super(); //For checking father's also
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Son's age");
 s_age = sc.nextInt();
 if(s_age<0)
 throw new NegativeAge("The entered age is negative!");
}
 void WrongAgeDiff() throws WrongAgeDiff
{
 if(s_age>=f_age)
 throw new WrongAgeDiff("Son's age can't be more than Father's age!");
}
}

class User_def_exception{
public static void main(String args[])
{
 String s1 = new String();
 try
{
 Son s = new Son(); //Constructor is invoked so, checked for NegativeAge exception
 s.WrongAgeDiff();
}
catch(NegativeAge n)
{
 //System.out.println("Caught the Negativeage exception");
  System.out.println(n);
}
catch(WrongAgeDiff w)
{
 //System.out.println("Caught the WrongAgeDiff exception");
System.out.println(w);
}
}
}
 
//javac user_def_exception.java
//java User_def_exception
 



 
