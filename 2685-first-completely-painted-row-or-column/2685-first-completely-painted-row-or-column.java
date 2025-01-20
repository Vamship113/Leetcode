class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int[][] freq= new int[(row*col)+1][2];
        int[] row_count = new int[row];
        int[] col_count= new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                freq[mat[i][j]][0]=i;
                freq[mat[i][j]][1]=j;
            }
        }
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int r=freq[num][0];
            int c=freq[num][1];
            row_count[r]++;
            if(row_count[r]==col) return i;
            col_count[c]++;
            if(col_count[c]==row) return i;
        }
        
        return -1;
    }
}