class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C= new int[A.length];
        int[] f = new int[A.length+1];
        int count=0;
        for(int i=0;i<A.length;i++){
             f[A[i]]++;
             if(f[A[i]]==2) count++;
             f[B[i]]++;
             if(f[B[i]]==2) count++;
             C[i]=count;
        }
        return C;
    }
}