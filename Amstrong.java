import java.util.*;
class Amstrong
{
public static void main(String args[])
{
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int ornum,re,result=0;
ornum=num;
while(ornum!=0)
{
re=ornum%10;
result+=Math.pow(re,3);
ornum=ornum/10;
}
if(result==num)
{
System.out.println("It is a Amstrong Number");
}
else
{
System.out.println("It is a not Amstrong Number");
}
}
}
