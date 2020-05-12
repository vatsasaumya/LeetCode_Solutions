/* https://leetcode.com/problems/two-sum/ */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] b = new int[2];
        int k = 0;
        int flag = 0;
        for(int i = 0;i < nums.length-1;i++)
        {
            for(int j = i+1;j < nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    b[k] = i;
                    k++;
                    b[k] = j;
                    flag = 1;
                }
                           
            }
            if(flag == 1)
                break;
        }
        return b;
        
    }
}