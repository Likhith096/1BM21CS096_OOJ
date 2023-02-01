import java.util.*;
 abstract class shape{

  double a,b;

        shape(int x,int y)
     {

          a=x;
          b=y;
      }



 abstract double printarea();
 
 }



 class Rectangle extends shape{

    
         Rectangle(int x,int y)
        {

            super(x,y);
         }
       
         double printarea()     
       {
           return  a*b;
        }

 }



class triangle extends shape{

            
           triangle(int x,int y)
           {

                super(x,y);
            }


           double printarea()     
       {
           return  0.5*(a*b);
        }
  }

class circle extends shape{
   circle (int x,int y)
           {

                super(x,-1);
            }

  
   double printarea(){
    return Math.PI *a*a;
   }
}



 class abst1{

   public static void main(String args[])

    {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter 1 for Rectangle \n  Enter 2 for Triangle \n Enter 3 for Circle\n");
	 int ch = sc.nextInt();
	 switch(ch)
	{
	 case 1: System.out.println("Enter the length and breadth");
	 	int l = sc.nextInt();
		int b = sc.nextInt();
		Rectangle r1=new Rectangle(l,b);
                shape s;
                s=r1;  
                double a1=s.printarea();
         	System.out.println("area of Rectangle is"+" "+a1);
		break;


	 case 2: System.out.println("Enter the base and height");
	 	int base = sc.nextInt();
		int height = sc.nextInt();
		triangle t1 = new triangle(base , height);
          	s=t1;  
             	a1=s.printarea();
          	System.out.println("area of triangle is"+" "+a1);
		break;  
              
     	 case 3: System.out.println("Enter the radius");
        	int x = sc.nextInt();
		circle c1 = new circle(x,-1);
		s=c1;
	   	a1=s.printarea();
	 	System.out.println("area of circle is"+" "+a1);
		break;
	default: System.out.println("Wrong case entered!");
		break;
	
	    
    }
 } 
}