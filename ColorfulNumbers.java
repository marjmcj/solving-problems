import java.util.*;

/*
    A number can be broken into different contiguous sub-subsequence parts.
    Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
    And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different

    Example:
    N = 23
    2 3 23
    2 -> 2
    3 -> 3
    23 -> 6
    this number is a COLORFUL number since product of every digit of a sub-sequence are different.

    Output : 1
 */



public class Solution {
    public static  int colorful(int A)
    {
       HashSet<Integer> listOfProducts = new HashSet<>();

        String aString = Integer.toString(A);
        for (int i = 0; i < aString.length(); i++)
            for (int j = i+1; j <= aString.length(); j++)
            {
                String tempNumber = aString.substring(i, j);
                // If we are a zero then we are not a colorful number as our product will always be zero.
                if(Integer.parseInt(tempNumber) == 0)
                {
                    return 0;
                }

                int product = product(tempNumber);
                if(listOfProducts.contains(product))
                {
                    return 0;
                }
                listOfProducts.add(product);
            }
        return 1;
    }

    private static int product(String number)
    {
        char[] chars = number.toCharArray();
        int product  = 1;
        for(Character c : chars)
        {
            product *= Integer.parseInt(String.valueOf(c));

        }
        return product;
    }

    public static void main(String[] args)
    {
        System.out.println(Solution.colorful(3245));
        System.out.println(Solution.colorful(23));
        System.out.println(Solution.colorful(2233));


    }

}
