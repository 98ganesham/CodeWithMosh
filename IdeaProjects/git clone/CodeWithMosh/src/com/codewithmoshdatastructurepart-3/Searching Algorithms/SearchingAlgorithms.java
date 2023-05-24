package SearchingAlgorithms;

import java.util.Arrays;

public class SearchingAlgorithms {
    public int linearSearch(int [] array, int target) {
        for (var i = 0; i < array.length; i++)
            if (array[i] == target)
                return i;
        return -1;
    }

    //BinarySearchRecursive
    public int binarySearchRec(int [] array, int target){
        return binarySearchRec(array, target, 0, array.length-1 );
    }
    private int binarySearchRec
    (int[] array, int target, int left, int right){
        if(right < left)
            return -1;
        int middle = (left + right)/2;
        if(array[middle] == target)
            return middle;
        if(target < array [middle])
            return binarySearchRec(array, target, left, middle-1);
        return binarySearchRec(array, target, middle+1, right);
    }


    //BinarySearchIterative
    public int binarySearch(int [] array, int target){
        var left = 0;
        var right = array.length-1;
        while(left <= right){
            var middle = (left+ right)/2;
            if(array[middle] == target)
                return middle;
            if(target < array[middle])
                right = middle -1;
            else
                left = middle +1;
        }
        return -1;

    }


    //TernarySearch
    public int ternarySearch(int[] array, int target){
        return ternarySearch(array, target, 0, array.length-1);
    }
    private int ternarySearch
            (int[] array, int target, int left, int right){
        if(left > right)
            return -1;
        int partitionSize = (right-left)/2;
        int mid1 = left + partitionSize;
        int mid2 = right- partitionSize;
        if(array[mid1] == target)
            return mid1;
        if(array[mid2] == target)
            return mid2;
        if(target < array [mid1])
            return ternarySearch(array, target, left,mid1-1);
        if(target > array[mid2])
            return ternarySearch(array, target, mid2+1, right);
        return ternarySearch(array, target, mid1+1, mid2-1);

    }
    //JumbSearch
    public int jumbSearch(int[] array, int target){
        int blocksize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blocksize;
        while(start < array.length && array[next-1] < target){
            start = next;
            next += blocksize;
            if(next >= array.length)
                next = array.length;

        }
        for (var i= start; i < next; i++)
            if(array[i] == target)
                return i;
        return -1;
    }


    //ExponentialSearch
    public int exponentialSearch(int [] array, int target) {
        int bound = 1;
        while (bound < array.length && array[bound] < target)
            bound *= 2;
        int left = bound /2;
        int right = Math.min(bound, array.length-1);
        return binarySearchRec(array, target, left, right);
    }

}
