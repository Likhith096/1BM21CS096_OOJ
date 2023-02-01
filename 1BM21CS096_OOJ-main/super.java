//Super can access Constructor,variable,method from super class! (done by sub class)
//super(); -- calls the constructor
//super.var_name; -- for variable
//super.method_name(); -- for method
import java.util.*;
class A
{
    int a=10;
    int b=90;
    A(int a, int b)
    {
        System.out.println("I am in A class!");
        System.out.println(a+b);
    }
    void data()
    {
        System.out.println("This will be printed by Super even though there is no data method in sub class!");
    }
    void details()
    {
        System.out.println("This is 2023!");
        System.out.println("This is January!");
    }
}
class B extends A
{
    int a=50;
    B(int a)
    {
        //here when class B constructor is called ,class A will also be called 
        //Only is A (Super class) is non parameterized constructor
        //class B can be parameterised and A() is called without super
        //But if A is parametrised constructor , then it must to have super! 
        super(5,4);
        System.out.println("I am in B class!");
        this.a=a;//as i am passing local variable a and instance variable is also a!
//Java compiler needs to understand which 'a', is referred , so this keyword refers to instance variable 
        System.out.println(a);//value of a in sub class is printed 
        System.out.println(super.a);//value of a in super class is printed
        System.out.println(b);//We can access super class variable's
    }
    void show()
    {
        System.out.println(a);
    }
    void details()
    {
        super.data();
        data();//This also will work!
        super.details();//Way to call super class method
        System.out.println("Today is 30th!");
    }

}

class run{
public static void main(String[] args) {
    B ob = new B(69);
    ob.show();
    ob.details();
}
}