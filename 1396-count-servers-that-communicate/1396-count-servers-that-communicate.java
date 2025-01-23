class Solution {
    public int countServers(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        int[] rows= new int[m];
        int [] cols= new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    rows[i]++;
                    cols[j]++;
                }
        }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && (rows[i]>1 || cols[j]>1)) count++;
        }
        }
       return count;
    }
}