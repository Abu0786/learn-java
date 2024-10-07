package c;

import a.A1;

public class C1 {
    public static void main(String[] args){
        //System.out.println(A1.a); not visible a is private in A1
        //System.out.println(A1.b);//default can't be accessed in different packages if it is subclass or not
        System.out.println(A1.c);
        //System.out.println(A1.d);//Protected is not assigned in different packages without subclass
    }
}
