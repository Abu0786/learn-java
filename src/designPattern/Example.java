package designPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws Exception,CloneNotSupportedException {
//        Singleton singleton = Singleton.getSingleTon();
//        System.out.println(singleton.hashCode());
//        Singleton singleton12 = Singleton.getSingleTon();
//        System.out.println(singleton.hashCode());
//        System.out.println(Eager.getEager().hashCode());
//        System.out.println(Eager.getEager().hashCode());

//        Singleton s1 = Singleton.getSingleTon();
//        System.out.println(s1.hashCode());
//        //Reflect API to braek singleton design pattern
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());


        // using enum to break reflection API
//        Singleton s1= Singleton.INSTANCE;
//        System.out.println(s1.hashCode());
//        s1.test();
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());

     // using deserialization to break Singleton pattern
        Singleton s1 = Singleton.getSingleTon();
        System.out.println(s1.hashCode());
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        objectOutputStream.writeObject(s1);
//        System.out.println("serialization done.......");
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Singleton s2 = (Singleton) objectInputStream.readObject();
//        System.out.println(s2.hashCode());

        Singleton s2 = (Singleton) s1.clone();
        System.out.println(s2.hashCode());


    }
}
