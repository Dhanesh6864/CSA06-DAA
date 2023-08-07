 class Outer
{
void out()
{

System.out.println("OuterClass");

}
public static class Inner
{
void in()
{
System.out.println("Inner Class");
}
}
public static void main(String args[])
{
Outer o=new Outer();
Inner i=new Inner();
o.out();
i.in();
//i.out();
//o.in();
}
}
