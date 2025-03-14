class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maxCandies=0;
        for(int pile: candies)
        maxCandies=Math.max(pile,maxCandies);
        
        int left=1,right=maxCandies;
        int mid=0;
        int m=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(canGetCandies(candies,k,mid)) {
                left=mid+1;
                }
            else right=mid-1;
        }
        return left-1;
    }
    boolean canGetCandies(int[] candies,long k, int numberOfCandies){
        long maxChildren=0;
        for(int pile: candies)
        maxChildren+=pile/numberOfCandies;

        return maxChildren>=k;
        
    }
}