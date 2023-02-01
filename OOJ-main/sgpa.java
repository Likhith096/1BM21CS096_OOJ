import java.util.*;
class student
{
 String usn , name;
 int credits[] = new int[20];
 double marks[] = new double[20];
 double cie[] = new double[20];
 double see[] = new double[20];
 int n;
 String subject_name[] = new String[30];
 double sgpa;
 void accept()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your name");
 name=sc.nextLine();
System.out.println("Enter your USN");
 usn=sc.nextLine();
System.out.println("Enter the number of subjects");
 n=sc.nextInt();

 
System.out.println("Enter the subject names");
for(int i=0;i<n;i++)
{
 subject_name[i]=sc.next();
} 
System.out.println("Enter the credits in order"); 
for(int i=0;i<n;i++)
{
 credits[i]=sc.nextInt();
} 
System.out.println("Enter the CIE marks in order");
for(int i=0;i<n;i++)
{
 cie[i]=sc.nextDouble();
}  
System.out.println("Enter the SEE marks in order"); 
for(int i=0;i<n;i++)
{
 see[i]=sc.nextDouble();
 marks[i] = (see[i]/2) + cie[i] ;
} 
}


 int check_grade( double cie , double see ,double marks)
 {
  if(cie<20)
   return 0;
  else if(see<40)
   return 0;
  else 
  {
   if( marks>=90 && marks<=100)
    return 10;
   if( marks>=80 && marks<90)
    return 9;
   if( marks>=70 && marks<80)
    return 8;
   if( marks>=60 && marks<70)
    return 7;
   if( marks>=55 && marks<60)
    return 6;
   if( marks>=50 && marks<55)
    return 5;
   if( marks>=40 && marks<50)
    return 4;
   else
    return 0;
   }
}

 
 double calculate()
{
 int total_credits=0;
 int sum=0;
 
 for(int i=0;i<n;i++)
{ 
 sum+= check_grade(cie[i],see[i],marks[i]) * credits[i];
 total_credits+=credits[i];
}
 sgpa = (double)sum/total_credits;
 return sgpa;
}


void display()
{
 System.out.println("Name: " +name);
 System.out.println("USN: " +usn);
 System.out.println("Subject_name \t Credits CIE marks \t SEE marks \t TOTAl marks \t Grade points");

 for(int i=0;i<n;i++)
{ 
  System.out.println(subject_name[i] +"\t\t"+ credits[i] + "\t"+ cie[i] + "\t\t" + see[i] + "\t\t" + marks[i] + "\t\t" + check_grade(cie[i],see[i],marks[i]) );
}
  System.out.println("SGPA = " +sgpa);
}
}

class run
{
 public static void main(String args[])
 {
  student ob = new student();
  ob.accept();
  ob.calculate();
  ob.display();
 }
}
























 