package SearchingAlgorithms;

public class Main {
    public static void main(String[] names){
        int[] numbers = {1,3,4,5,6,7};
        var search = new LinearSearch();
        var index =search.exponentialSearch(numbers, 1);
        System.out.println(index);
    }


}
