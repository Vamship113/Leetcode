class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans=0;
        int n=grid.length;
        int[] result= new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[grid[i][j]]++;
            }
        }
        int a=0,b=0;
        for(int i=1;i<result.length;i++){
            int num=result[i];
            if(num==2)
            a=i;
            else if(num==0) b=i;
        }
        return new int[] {a,b};
    }
}