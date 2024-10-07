package collection1;

import java.util.ArrayList;

public class ArrayLIst1 {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();

        l.add("Apple");
        l.add("orange");
        l.add(null);
        l.add("");
        System.out.println("list===> "+l);
        System.out.println("0th element====>"+l.get(0));
        System.out.println("size::"+l.size());
        l.remove(3);
        System.out.println("list===> "+l);
        l.add(2,"grapes");
        System.out.println("list===> "+l);


    }
}
