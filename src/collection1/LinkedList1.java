package collection1;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("orange");
        System.out.println(list);
        list.addFirst("apple");
        System.out.println(list);
        list.addLast("carrot");
        System.out.println(list);
        list.addLast(null);
    }
}
