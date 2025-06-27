class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited= new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    bfs(i,j,visited,grid);
                }
            }
        }
    return count;
    }
    void bfs(int i,int j,boolean[][] visited ,char[][] grid ){
        visited[i][j]=true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(i,j));

        int m=grid.length;
        int n=grid[0].length;
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            int[] offsets = {-1, 0, 1, 0,-1}; // Up right down left

            for (int k = 0; k < 4; k++) {
                int nrow = row + offsets[k];
                int ncol = col + offsets[k+1];
                if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n) {
                    if (grid[nrow][ncol] == '1' && !visited[nrow][ncol]) {
                        visited[nrow][ncol] = true;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }

        }
    }
}
class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}