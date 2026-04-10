import java.util.ArrayList;

class Solution {
    public int minimumDistance(int[] nums) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (!check[i]) {
                ArrayList<Integer> ins = new ArrayList<>();
                check[i] = true;
                ins.add(i);
                for (int j = i + 1; j < nums.length; j++) {
                    if (!check[j] && nums[i] == nums[j]) {
                        ins.add(j);
                        check[j] = true;
                    }
                }
                if (ins.size() >= 3) {
                    ls.add(ins);
                }
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (ArrayList<Integer> indices : ls) {
            // Check all consecutive triplets within this number's group
            for (int i = 0; i <= indices.size() - 3; i++) {
                int idx1 = indices.get(i);
                int idx2 = indices.get(i + 1);
                int idx3 = indices.get(i + 2);
                
                int currentSum = Math.abs(idx1 - idx2) + 
                                 Math.abs(idx2 - idx3) + 
                                 Math.abs(idx1 - idx3);
                
                if (currentSum < minSum) {
                    minSum = currentSum;
                }
            }
        }

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}
