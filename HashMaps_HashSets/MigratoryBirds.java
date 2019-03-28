
import java.util.*;

/*
    Task:
    Complete the migratoryBirds function below. It should return the lowest type number of the most frequently sighted bird.
    Output:
    Print the type number of the most common bird; if two or more types of birds are equally common, choose the type
    with the smallest ID number.

   

*/

public class Solution {

    // arr: an array of integers representing types of birds sighted
    static int migratoryBirds(List<Integer> arr)
    {
        HashMap<Integer, Integer> map = new HashMap();
        int mostSightedBird = 0;
        int value = 0;
        for (int key : arr)
        {
            if (map.containsKey(key))
            {
                map.put(key, map.get(key) + 1);
                if (map.get(key) > value)
                {
                    value = map.get(key);
                    mostSightedBird = key;
                }
                if (map.get(key) == value && key < mostSightedBird)
                {
                    mostSightedBird = key;
                }
            }
            else
                {
                map.put(key, 1);
            }
        }
        return mostSightedBird;
    }

    public static void main(String[] args)
    {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        System.out.println("Most sighted bird: " + migratoryBirds(arr));
    }
}
