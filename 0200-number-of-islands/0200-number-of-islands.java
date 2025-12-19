class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        boolean[][] valid = new boolean[grid.length][grid[0].length];
        for(int i=0;i<valid.length;i++){
            for(int j=0;j<valid[i].length;j++){
                if(!valid[i][j] && grid[i][j] == '1'){
                    BFS(grid,i,j,valid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    private static void BFS(char[][] grid,int x,int y,boolean[][] valid){
        Queue<int[]> qe = new LinkedList<>();
        qe.add(new int[]{x,y});
        valid[x][y] = true;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        while(!qe.isEmpty()){
            int[] curr = qe.poll();
            for(int i=0;i<dirs.length;i++){
                int nx = curr[0] + dirs[i][0];
                int ny = curr[1] + dirs[i][1];
                if(nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length &&
                   !valid[nx][ny] && grid[nx][ny] == '1'){
                    qe.add(new int[]{nx,ny});
                    valid[nx][ny] = true;
                }
            }
        }
    }
}