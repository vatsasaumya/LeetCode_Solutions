class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> choice = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] flag = new boolean[nums.length];
        findPerm(nums,flag,choice,result);
        return result;
    }
    public static void findPerm(int[] nums,boolean[] flag, List<Integer> choice, List<List<Integer>> result)
    {
        if(choice.size() == nums.length)
        {
            result.add(new ArrayList<>(choice));
            return;
        }
        for(int i=0; i<nums.length; i++)
        {
            if(flag[i] == false)
            {
                if(i>0 && nums[i]==nums[i-1] && flag[i-1]==true)
                    continue;
                flag[i] = true;
                choice.add(nums[i]);
                findPerm(nums,flag,choice,result);
                choice.remove(choice.size()-1);
                flag[i] = false;
            }
        }
    }
}