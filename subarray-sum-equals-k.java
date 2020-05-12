/* https://leetcode.com/problems/subarray-sum-equals-k/ */

class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        int inc = 0;
        int dec = 0;
        if(nums.length > 1)
        {
        for(int i = 0; i < nums.length-1; i++)
        {
           if(nums[0] == k)
           {
           dec = 1;
           }
            if(nums[i] == k && i>0)
            c++;
           int sum = nums[i];
           for(int j = i+1;j < nums.length;j++)
           {
               sum = sum + nums[j];
               if(sum == k)
                   c++;
              
           }
        }
            if(nums[nums.length-1] == k)
                c++;
        }
        
        if(nums.length == 1)
        {
            if(nums[0] == k)
                c = 1;
        }
        return c+dec;
          
        
    }
}