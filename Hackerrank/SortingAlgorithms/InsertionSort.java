import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{

    /*
      Given a sorted list with an unsorted number in the rightmost cell, write some 
      simple code to insert into the array so that it remains sorted.
      - Print the array as a row of space-separated integers each time there is a shift or insertion.
    
    */

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr)
    {
        int numberToReorder = arr[arr.length -1];
        int position = arr.length;
        while(position-- > 0)
        {
            if(arr[position - 1] < numberToReorder)
            {
                break;
            }
            arr[position] = arr[position -1];
            printArray(arr);


        }
        arr[position] = numberToReorder;
        printArray(arr);

    }



    static void printArray(int[] arr)
    {
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
