class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        findCombination(candidates,target,l,result,0);
        return result;
    }
    private static void findCombination(int[] candidates, int target, List<Integer> l,List<List<Integer>> result, int index)
    {
        if(index == candidates.length)
        {
            if(target == 0)
            {
                result.add(new ArrayList<>(l));
            }
            return;
        }
        if(candidates[index] <= target)
        {
            l.add(candidates[index]);
            findCombination(candidates, target-candidates[index], l, result, index);
            l.remove(l.size()-1);
        }
        findCombination(candidates, target, l, result, index+1);
    }
}