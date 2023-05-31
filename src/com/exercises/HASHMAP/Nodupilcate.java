import java.util.HashSet;
import java.util.Set;

public class Nodupilcate{

    public static void main(String [] args){
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,4,4,5,6,6,7,6,8,10};
        for(var number : numbers )
            set.add(number);
        System.out.println(set);
    }
}