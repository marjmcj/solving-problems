
import java.util.*;


public class Solution {

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
