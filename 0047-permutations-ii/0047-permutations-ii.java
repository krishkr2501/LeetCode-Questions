class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> tot = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; 
        rec(nums, tot, ls, used);
        return tot;
    }

    private void rec(int[] nums, List<List<Integer>> tot, List<Integer> ls, boolean[] used) {
        if (ls.size() == nums.length) {
            if (!tot.contains(ls)) {  
                tot.add(new ArrayList<>(ls));  
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {  
                used[i] = true;
                ls.add(nums[i]);
                rec(nums, tot, ls, used);
                ls.remove(ls.size() - 1);
                used[i] = false;
            }
        }
    }
}