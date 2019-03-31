/*
You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. 
You are allowed to swap any two elements. 
You need to find the minimum number of swaps required to sort the array in ascending order.
*/


public class Solution
{
  
  
  public static int minimumSwaps(int[] arr)
  {
      int swaps = 0;
      int index = 0;
      while(index < arr.length)
      {
          //If the number that's at our current index is different to the number it should be, let's put this
          //number where it belongs.
          if(arr[index] != index + 1)
          {
              int targetIndex = arr[index] - 1;
              int temp = arr[targetIndex];
              arr[targetIndex] = arr[index];
              arr[index] = temp;
              swaps++;
          }
          else
          {
            index++;
          }
      }
      return swaps; 
  }
  
  
  
  public static void main(String[] args)
  {
    System.out.println(Solution.minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}));
  }
}
