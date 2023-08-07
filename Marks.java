import java.util.*;
class Marks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the subject Marks");
System.out.println("Enter Physics subject Marks:");
int physics=sc.nextInt();
System.out.println("Enter ch subject Marks:");
int ch=sc.nextInt();
System.out.println("Enter maths subject Marks:");
int maths=sc.nextInt();
System.out.println("Enter english subject Marks:");
int english=sc.nextInt();
System.out.println("Enter science subject Marks:");
int scince=sc.nextInt();
int p;
int total=0;
total=(physics+ch+maths+scince+english)/5;
if(total>65)
{
System.out.println("Student Eligable:"+total);
}
else 
{
System.out.println("Student not Eligable:"+total);
}
p=(total/500)*100;
if(p>=60 && p<=80)
{
System.out.println("Student is Condition:"+p);
}
}
}