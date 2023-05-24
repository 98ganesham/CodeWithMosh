import java.util.Arrays;

public class Main{
    public static void main(String [] names ){
        int[] numbers = {1,2};
        var sorter = new BucketSort();
        sorter.sort(numbers, 20);
        System.out.println(Arrays.toString(numbers));


    }
}