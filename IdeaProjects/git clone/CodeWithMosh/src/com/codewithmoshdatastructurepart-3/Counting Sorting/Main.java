import java.util.Arrays;

public class Main{
    public static void main(String [] names ){
        int[] numbers = {1,2};
        var sorter = new CountingSort();
        sorter.sort(numbers, 2);
        System.out.println(Arrays.toString(numbers));


    }
}