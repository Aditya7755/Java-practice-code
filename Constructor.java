class Demo 
{
int x,y;
Demo ()
{
System.out.println("Constructor 1 executed");
}
void fun1()
{
System.out.println("Function 1 executed");
}
}
class Constructor
{
public static void main (String args[])
{
Demo d1 = new Demo();
Demo d2 = new Demo();
Demo d3 = new Demo();
}
}