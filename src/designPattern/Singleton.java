package designPattern;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable {
//    INSTANCE;
     //static variable because we can access inside static context
    private static Singleton singleton;
    //constructor
    private Singleton(){
//        if (singleton != null){
//            throw new RuntimeException("you are trying to break singleton pattern");
//        }

    }
    //static method to eliminates the need of creating object
    public static Singleton getSingleTon(){
       // Lazy initialization way to create object
        //in case of Single thread
//        if(singleton==null){
//            singleton = new Singleton();
//        }
        //in case of multiple thread
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public Object readResolve(){
        return singleton;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
      return super.clone();
    }

//    public void test(){
//        System.out.println("test call through enum");
//    }
}
