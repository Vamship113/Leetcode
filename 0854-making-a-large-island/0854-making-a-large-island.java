class Solution {
    private int[] dir={-1,0,1,0,-1};
    boolean isValid(int x, int y, int n){
        return x>=0 && x<n && y>=0 && y<n;
    }
    int markIsland(int[][] grid,int islandNumber,int n,int x,int y){
        grid[x][y]=islandNumber;
        int count=1;
        for(int i=0;i<4;i++){
            int newX=x+dir[i];
            int newY=y+dir[i+1];
            if(isValid(newX,newY,n) && grid[newX][newY]==1)
             count+=markIsland(grid,islandNumber,n,newX,newY);
        }
        return count;
    }
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        Map<Integer,Integer> islandSize = new HashMap<>();
        int islandNumber=2;
        
        //mark islands with numbers >=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int island=markIsland(grid,islandNumber,n,i,j);
                    islandSize.put(islandNumber,island);
                    islandNumber++;
                }
            }
        }

        //try convert 0 to 1 find maximum 
        int maxSize=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    Set<Integer> islands= new HashSet<>();
                        for(int d=0;d<4;d++){
                            int newX=i+dir[d];
                            int newY=j+dir[d+1];
                            if(isValid(newX,newY,n) )
                            islands.add(grid[newX][newY]);
                        }
                        int curisland=1;
                        for(int key:islands){
                            curisland+=islandSize.getOrDefault(key,0);
                        }
                        maxSize=Math.max(maxSize,curisland);
                }
            }
        }
        return maxSize==0?n*n: maxSize;

    }
}