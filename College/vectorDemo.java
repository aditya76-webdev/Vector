package College;

import java.util.*;

class vectorDemo {

public static void main(String[] arg){

List arr = new ArrayList();

arr.add(3);

arr.add("Hello");

arr.add("World");

arr.add(4);

Vector v = new Vector();

v.add(2); // capacity = (cc*3/2)+1

v.addAll(1, arr);

System.out.println("vector v:" + v);
System.out.println(v.get(3));
System.out.println(v.contains(3));

//v.clear();

int index = v.indexOf("world");
int index1 = v.indexOf("World");

    System.out.println("index of world is :"+ index);
    System.out.println("index of World is : "+ index1);
    System.out.println("index of World is : "+ v.indexOf("World"));

//System.out.println("after clearing: " + v);
    System.out.println("capacity before trimming:"+v.capacity());
    System.out.println("size before trimming:"+v.size());
    v.trimToSize();
    System.out.println(v.size() == v.capacity());
    System.out.println("capacity after trimming:"+v.capacity());
    System.out.println("size after trimming:"+v.size());
}

}