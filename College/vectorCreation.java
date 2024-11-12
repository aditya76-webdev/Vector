package College;

import java.util.*;

public class vectorCreation {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add("java");
        v1.add(true);
        v1.add("program");
        v1.insertElementAt(10,0);
//        v1.clear();
        System.out.println(v1);
    }
}