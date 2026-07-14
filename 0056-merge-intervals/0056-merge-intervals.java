class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ls = new ArrayList<>();
        
        int[] current = intervals[0];
        ls.add(current);
        
        for (int i = 1; i < intervals.length; i++) {
            int currentEnd = current[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            
            if (currentEnd >= nextStart) {
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                current = intervals[i];
                ls.add(current);
            }
        }
        
        return ls.toArray(new int[ls.size()][]);
    }
}
