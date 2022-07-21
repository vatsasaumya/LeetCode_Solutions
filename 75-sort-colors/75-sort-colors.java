class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        count[0]=0;
        count[1]=0;
        count[2]=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                count[0]++;
            if(nums[i]==1)
                count[1]++;
            if(nums[i]==2)
                count[2]++;
        }
        for(int j=0; j<count[0]; j++)
        {
            nums[j]=0;
        }
        for(int k=count[0]; k<count[0]+count[1]; k++)
        {
            nums[k]=1;
        }
        for(int l=count[0]+count[1]; l<count[0]+count[1]+count[2]; l++)
        {
            nums[l]=2;
        }
        
    }
}