class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length;
        int n=isWater[0].length;
        int[][] height = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited= new boolean[m][n];
        //push all start points for multi-source BFS
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1)
                {
                    queue.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        // multi source level order
        int[] dir={-1,0,1,0,-1}; // 4 directional calls
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int[] cur=queue.poll();
                int x=cur[0];
                int y=cur[1];
                for(int d=0;d<4;d++){
                    int newX=x+dir[d];
                    int newY=y+dir[d+1];
                    if(isValid(newX,newY,m,n) && !visited[newX][newY]){
                        queue.offer(new int[]{newX,newY});
                        height[newX][newY]=level+1;
                        visited[newX][newY]=true;

                    }
                }
            }
            level++;
        }
        return height;
    }
    private boolean isValid(int x,int y,int m,int n){
        return (x>=0 && x<m && y>=0 && y<n);
    }
}