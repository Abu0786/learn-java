import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits= new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Date");
        fruits.add("Orange");
        fruits.add(null);
        for(String fruit:fruits){
            System.out.println(fruit);
        }

        fruits.remove("Banana");
        System.out.println("after removing bana");
        for(String fruit:fruits){
            System.out.println(fruit);
        }

        if(fruits.contains("Mango")){
            System.out.println("Mango is in the list");
        }

        if(fruits.contains("Banana")){
            System.out.println("Banana is in the list");
        }

        System.out.println("Number of fruits in the list "+fruits.size());
    }
}