class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C= new int[A.length];
        int[] f = new int[A.length];
        for(int i=0;i<A.length;i++){
             f[A[i]-1]++;
             f[B[i]-1]++;
             C[i]=check_frequency(f);
        }
        return C;
    }
    int check_frequency(int[] f){
        int c=0;
        for(int i=0;i<f.length;i++){
            if(f[i]==2) c++; 
        }
        return c;
    }
}