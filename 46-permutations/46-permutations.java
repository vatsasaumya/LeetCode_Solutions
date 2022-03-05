class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> ds = new ArrayList<Integer>();
        boolean[] flag = new boolean[nums.length];
        repeatPermute(nums,ds,flag,result);
        return result;
        
    }
    public static void repeatPermute(int[] nums, List<Integer> ds, boolean[] flag,List<List<Integer>> result)
    {
        if(ds.size() == nums.length)
        {
            result.add(new ArrayList<>(ds));
            return;
        }
        else
        {
            for(int i=0; i<nums.length; i++)
            {
                if(flag[i] == false)
                {
                    flag[i] = true;
                    ds.add(nums[i]);
                    repeatPermute(nums,ds,flag,result);
                    ds.remove(ds.size()-1);
                    flag[i] = false;
                }
            }
        }
    }
}