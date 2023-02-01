import java.util.*;

class quadratic
{
 public static void main(String args[])
 {
  int d,a,b,c;
  double r1,r2;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the coefficient of x^2 ");
  a=sc.nextInt();
  System.out.println("Enter the coefficient of x ");
  b=sc.nextInt(); 
  System.out.println("Enter the constant ");
  c=sc.nextInt();
  d=b*b-4*a*c;
  if(a==0)
  {
   System.out.println("Invalid inputs");
  }
else
{
  if(d>0)
  {
   System.out.println("The roots are real and distinct");
   r1=(-b-Math.sqrt(d))/(2*a);
   r2=(-b+Math.sqrt(d))/(2*a);
   System.out.println("The roots are "+ r1 +"  " +r2);
  }
 if(d<0)
 {
  System.out.println("The roots are imaginary");
  r1=-b/(2*a);
  r2=Math.abs(d)/(2*a);
  System.out.println("The roots are "+ r1+" +"+" i"+r2 +"  "+r1+" -"+" i"+r2);
 }
 if(d==0)
 {
  System.out.println("The roots are real and equal");
  r1=r2=-b/(2*a);
  System.out.println("The roots are "+ r1 +"  " +r2);
 }
}
}
}

