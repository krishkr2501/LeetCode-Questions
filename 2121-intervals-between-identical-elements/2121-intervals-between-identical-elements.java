class Solution {
    public long[] getDistances(int[] arr) {
        int n = arr.length, m1 = arr[0], m2 = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < m1)
                m1 = arr[i];
            if (arr[i] > m2)
                m2 = arr[i];
        }
        m2 = m2 - m1 + 1;
        long[] s1 = new long[m2];
        long[] s2 = new long[m2];
        int[] c1 = new int[m2];
        int[] c2 = new int[m2];
        for (int i = 0; i < n; i++) {
            s2[arr[i] - m1] += i;
            c2[arr[i] - m1] += 1;
        }
        long[] r = new long[n];
        for (int i = 0; i < n; i++) {
            int x = arr[i] - m1;
            r[i] = (1L * c1[x] * i - s1[x]) + (s2[x] - 1L * i * c2[x]);
            s1[x] += i;
            s2[x] -= i;
            c1[x] += 1;
            c2[x] -= 1;
        }
        return r;
    }
}