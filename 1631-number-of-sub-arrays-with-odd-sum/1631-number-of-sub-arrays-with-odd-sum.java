class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int prefixSum=0;
        int oddCount=0;
        int evenCount=1;
        int count=0;
        for(int num: arr){
            prefixSum+=num;
            if((prefixSum & 1) ==1)
            {
                count+=evenCount;
                oddCount++;
            }
            else{
                count+=oddCount;
                evenCount++;
            }
            count%=MOD;
        }
        return count;
    }
}