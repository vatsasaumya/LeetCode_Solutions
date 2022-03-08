class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        boolean result = false;
        for(int i=0; i<nums.length; i++)
            sum = sum + nums[i];
        result = partition(nums,sum);
       return result;
    }
    public static boolean partition(int[] nums,int sum)
    {
        boolean[][] dp = new boolean[nums.length+1][(sum/2)+1];
        if(sum%2!=0)
            return false;
        else
        {
            for(int i=0;i<nums.length+1;i++)
            {
                for(int j=0; j<(sum/2)+1; j++)
                {
                    if(i==0)
                    dp[i][j] = false;
                    else
                    dp[i][j] = true;
                }
            }
            for(int i=1;i<nums.length+1;i++)
            {
                for(int j=1; j<(sum/2)+1; j++)
                {
                    if(nums[i-1] <= j)
                    {
                        dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                    }
                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
           
            
        }
         return dp[nums.length][sum/2];
    }
}