import java.util.Arrays;

public class Main{
    public static void main(String [] names ){
        int[] numbers = {1,2};
        var sorter = new Selectionsort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
}