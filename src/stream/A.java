package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {


    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,3,6,7,8,10);
        List<Integer> evenNumbers= numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> oddSquares= numbers.stream().filter(n->n%2!=0).map(n->n*n).collect(Collectors.toList());
        System.out.println(oddSquares);
        System.out.println(evenNumbers);
        int sum= numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }

}
