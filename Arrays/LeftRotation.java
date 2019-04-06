import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



/*
    A left rotation operation on an array shifts each of the array's elements d units to the left. 
    Given an array  of  integers and a number d, perform d left rotations on the array.
    Return the updated array to be printed as a single line of space-separated integers.
*/

public class Solution
{   
    // We can easily do this inside of a while loop and have d x arr.length runtime complexity, and constant memory usage.
    // However, if we want to sacrifice a little bit on the memory side  we can have a linear runtime.
    static int[] rotLeft(int[] a, int d)
    {
        int[] result = new int[a.length];
        for(int i = 0; i < a.length; i++)
        {
            int newIndex = newPosition(i, a.length, d);
            result[newIndex] = a[i];
        }
        return result;
    }

    static int newPosition(int originalIndex, int arrayLength, int rotations)
    {
        int newIndex = 0;
        if(originalIndex  < rotations)
        {
            newIndex = rotations - (originalIndex);
            newIndex = (arrayLength - newIndex);
        }
        else if(originalIndex == rotations)
        {
            newIndex =  originalIndex - rotations;
        }
        else
        {
            newIndex = originalIndex - rotations;
        }
        return newIndex;
    }

    public static void main(String[] args)
    {
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(rotLeft(intArray, 4)));


    }

}
