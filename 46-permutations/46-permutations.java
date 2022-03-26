class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> choice = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        findPerm(nums,choice,result,flag);
        return result;
    }
    public static void findPerm(int[] nums,List<Integer> choice,List<List<Integer>> result, boolean[] flag)
    {
        if(choice.size() == nums.length)
        {
            result.add(new ArrayList<>(choice));
            return;
        }
        for(int i=0; i<nums.length; i++)
        {
            if(flag[i]==false)
            {
                flag[i] = true;
                choice.add(nums[i]);
                findPerm(nums,choice,result,flag);
                choice.remove(choice.size()-1);
                flag[i] = false;
            }
            
        }
        
        
    }
}