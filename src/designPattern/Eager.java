package designPattern;

public class Eager {
    private Eager(){

    }
    //Eager way of creating object
    private static Eager eager = new Eager();

    public static Eager getEager(){
        return eager;
    }
}
