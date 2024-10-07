import java.util.HashMap;
import java.util.Map;

public class HashMapImp {
    public static void main(String[] args) {
        var number = 42; // var type in java
        var a ="hello"; // var type in java
        Map<String , Integer> scores= new HashMap<>();

        scores.put("Ram", 90);
        scores.put("Shyam",95);
        scores.put("Ghanshyam", 110);

        System.out.println("Ram score===>"+ scores.get("Ram")); // 90

        System.out.println("All scores:");

        for (Map.Entry<String, Integer> entry:scores.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


        // Getting the size of the HashMap
        System.out.println("Number of entries: " + scores.size());

        System.out.println("number " + number +" a "+a);
    }
}
