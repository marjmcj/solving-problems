class Solution
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int arrayTotal = 0;
        for(int i = 0; i < nums.length; i++)
        {
            arrayTotal+= nums[i];
        }
        
        //Here we use Gauss's formula to find the summation of all numbers up to n
        return ((n* (n+ 1))/2) - arrayTotal;
    }
}

// Runtime complexity: O(n), Space complexity O(1)
