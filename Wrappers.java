class Wrappers
{
public static void main (String args[])
{
int x=Integer.parseInt("123");
System.out.println(x);

Integer x1 = Integer.valueOf("1000011", 2);
int y =  x1.intValue();

System.out.println(y);

Double z = Double.valueOf("56");
double z1 = z.intValue();

System.out.println(z1);
}
}