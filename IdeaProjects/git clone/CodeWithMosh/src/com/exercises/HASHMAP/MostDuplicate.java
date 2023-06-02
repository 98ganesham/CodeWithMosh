import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostDubilcate{
   public static void getMostFrequentElement(int inputArray[])
    {
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        for (int i : inputArray)
        {
            if (elementCountMap.containsKey(i))
            {
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                elementCountMap.put(i, 1);
            }
        }

        int element = 0;

        int frequency = 1;
        Set<Entry<Integer, Integer>> entrySet = elementCountMap.entrySet();

        for (Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > frequency)
            {
                element = entry.getKey();

                frequency = entry.getValue();
            }
        }



        if(frequency > 1)
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));

            System.out.println("The most frequent element : "+element);
        }
        else
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));

            System.out.println("No frequent element. All elements are unique.");

            System.out.println("=========================");
        }
    }

    public static void main(String[] args)
    {
        getMostFrequentElement(new int[]{1,2,3,4,5,6,1,2,3,4,5,6,1,3});
    }
}