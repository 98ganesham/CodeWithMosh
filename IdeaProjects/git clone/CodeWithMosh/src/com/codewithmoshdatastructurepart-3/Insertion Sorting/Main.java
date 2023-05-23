import java.util.Arrays;

public class Main {
    public static void main (String [] names){
        int [] numbers ={7,3, 5, 2, 1, 2 ,5, 8};
        var sorter = new InsertionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
