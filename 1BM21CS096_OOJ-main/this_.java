//It is used to show the current refering object
//It is used when local and instance variable have same name 
//It is use to call defualt constructor of its own class 
//It is used to call paramterised constructor of its own class
class A
{
    int a=10;//instance variable
    int b=15;
    A()
    {
        System.out.println("I am in Default constructor");
    }
    A(int a,int b)
    {
        System.out.println(a+b);
    }
    A(int a)//local variable is passed via constructor
    {
        //Constructor call should be first statement,so i can't use both this() and this(5,10)
        //this();//This calls default constructor of class A 
        this(5,10);
        this.a = a;//instance variable value is changed to local variable's value
        //a=a; -- this is error as JVM is confused
        System.out.println(a);
        this.b=a;//Not necessary as it is not repeating (instance b is getting value of local a)
        System.out.println(b);
    }
    void show()
    {

        System.out.println(this);//prints id of object it is pointing to
    }
}
class Main
{
    public static void main(String[] args) {
        A ob = new A(5);
        System.out.println(ob);//prints id of this object
        ob.show();//prints id of object 'ob' as pointed by 'this' , they both are pointing to same object , so same id
    }
}
