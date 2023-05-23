import java.util.Arrays;

public class Main{
    public static void main(String[] names){
        int[] numbers = {8,7,7,6,3,2,1,4,5};
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
}