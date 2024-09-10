class Mahesh
{
int x;
private int y=51;

void fun1()
{
System.out.println("fun1");
}
void fun2()
{
System.out.println("fun2");
}
}
class Object
{
public static void main (String args[])
{
Mahesh m1 = new Mahesh();
Mahesh m2 = new Mahesh();

System.out.println("Hello");
System.out.println(m2.y);  //it showing error because y is private
}
}