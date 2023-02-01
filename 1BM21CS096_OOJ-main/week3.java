//Create a class Book which contains four members: name, author, price, num_pages. Include a constructor to set the values for the members. Include methods to set and get the details of the objects. Include a toString( ) method that could display the complete details of the book. Develop a Java program to create n book objects.

import java.util.*;
 class book
{
 String name , author;
 double price;
 int num_pages;
 book()
{
name="x";
author="y";
price=0.0;
num_pages=0;
}

void get()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the name of the Book:");
 name=sc.nextLine();
 System.out.println("Enter the name of the author:");
 author=sc.nextLine();
 System.out.println("Enter the price of the book:");
 price=sc.nextDouble();
 System.out.println("Enter the number of pages:");
 num_pages=sc.nextInt();
}

public String toString() //it gets invoked when object is called and returns a string , so we strore in a string variable and return it
{
 String str = "Book name:"+name+"\n"+"Author name:"+author +"\n" +"Book Price:"+price +"\n" + "Number of pages:"+num_pages ;
 return str;
}
}
class run
{
 public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of books");
 int n=sc.nextInt();
 book ob[]=new book[n];
 for(int i=0;i<n;i++)
{
 ob[i]= new book(); //creating a object for every element of array -- so array of objects
 System.out.println("Enter the details of "  + "book " + (i+1));
 ob[i].get();
}
for(int i=0;i<n;i++)
{
 System.out.println("The details of "  + "book " + (i+1) + "is: " + ob[i]);//toString will be invoked when the object is called
 System.out.println("\n" +"\n");
}
}
}