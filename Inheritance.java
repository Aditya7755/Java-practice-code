class Nokia1
{
int x,y;
Nokia1()
{
System.out.println("parent's constructor executed");
}
void fun1()
{
System.out.println("parent function1 executed");
}
void fun2()
{
System.out.println("parent function2 executed");
}
}
class Nokia2 extends Nokia1
{
int z;
void fun3()
{
System.out.println("child fun1 executed");
}

Nokia2()
{
System.out.println("child constructor executed");
}
}

class Inheritance
{
public static void main (String args[])
{
Nokia2 n2 = new Nokia2();

}
}