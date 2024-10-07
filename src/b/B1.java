package b;

import a.A1;

public class B1 extends A1 {
    public static void main(String[] args){
       // System.out.println(A1.a); //not visible a is private in A1
        //System.out.println(b);//default can't be accessed outside of packages
        System.out.println(c);
        System.out.println(d);
    }
}
