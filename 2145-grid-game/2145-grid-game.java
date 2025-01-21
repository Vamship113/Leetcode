class Solution {
    public long gridGame(int[][] grid) {
        long first_row=0;
        for(int num:grid[0])
        first_row+=num;
        long second_row=0;
        long minsum=Long.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            first_row-=grid[0][i];
            minsum=Math.min(
                minsum,
                Math.max(first_row,second_row)
            );
            second_row+=grid[1][i];
        }
        return minsum;
    }
}