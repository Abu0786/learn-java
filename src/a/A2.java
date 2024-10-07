package a;

public class A2 extends A1{
    public static void main(String[] args){
        //System.out.println(A1.a); not visible a is private in A1
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
