import java.util.*;
class Cdemo
{
public static void main(String a[])
{
//  avoid duplicate value
// sorting 
// lets create a Set
Set tree=new TreeSet();
tree.add("Z");
tree.add("K");
tree.add("l");
tree.add("a");
tree.add("K");
tree.add(10);

System.out.println("Elements in treeset:"+tree);

Set hash=new HashSet(15); 
hash.add("Z");
hash.add("K");
hash.add("l");
hash.add("a");
hash.add("K");
hash.add(null);
hash.add(null);
hash.add(10);
System.out.println("Elements in hashset:"+hash);
// Sorting is based on the internal hashing/hashcode generated


// App--------------> frequently

}

}
