import java.util.*;
class Cdemo
{
public static void main(String a[])
{
// lets create a List
ArrayList ref=new ArrayList();
System.out.println(ref.size());
ref.add("Rumysia");
ref.add(new String("Rumysia"));
ref.add(new Integer(2025));
ref.add(56666.78f);
ref.add(true);
ref.add('A');
ref.set(2,"Shwetha");
System.out.println(ref.size());
System.out.println(ref.get(2));
// Check with Vector
Vector v=new Vector();
System.out.println("Initial Capacity of Vector:"+v.capacity());
v.add("1");
v.add("1");
v.add("1");
v.add("1");
v.add("1");
v.add("1");
v.add("1");
v.add("1");
v.add("1");
v.add("1");
v.add("1");
System.out.println("Capacity of Vector:"+v.capacity());
// Lets create another ArrayList
List ref1=new ArrayList();
ref1.add(new Integer(1999));
ref1.add(false);
ref1.add('B');
// Adding one colllection another collection
// also look into methods like addAll(),containsAll() for Collection
ref1.add(ref);
// After adding one collection another collection
System.out.println(ref1);





}

}
