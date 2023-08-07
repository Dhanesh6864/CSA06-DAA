import java.util.*;
class List
{
public static void main(String args[])
{
 LinkedList<String> animals=new LinkedList<>();
animals.add(0,"lion");
animals.add(1,"tiger");
animals.add(2,"cat");
animals.add(3,"dog");
animals.add(4,"wolf");
animals.add(5,"fox");
System.out.println("the added List is:"+animals);
animals.pop();
System.out.println("the pop List is:"+animals);

}
}