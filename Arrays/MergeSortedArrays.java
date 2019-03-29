class Solution
{
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int new_index = m + n - 1;
        int nums1_index = m;
        int nums2_index = n;
        while (nums1_index > 0 && nums2_index > 0)
        {
            //the last index from nums1 or nums2 will be compared, the bigger one will be copied to the "last index".
            //new_index then gets updated with the correct new "last" index.
            if (nums1[nums1_index - 1] > nums2[nums2_index - 1])
            {
                nums1[new_index] = nums1[nums1_index - 1];
                nums1_index--;
            }
            else
            {
                nums1[new_index] = nums2[nums2_index - 1];
                nums2_index--;
            }
            new_index--;

        }
        //If we have some items left in nums2, lets go ahead and copy them to nums1.
        while (nums2_index > 0)
        {
            nums1[new_index] = nums2[nums2_index - 1];
            new_index--;
            nums2_index--;
        }



    }
}
