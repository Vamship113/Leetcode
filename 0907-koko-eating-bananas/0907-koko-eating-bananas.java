class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=0;
        for(int pile : piles )
        maxPile=Math.max(maxPile,pile);

        int left=1,right=maxPile;
        while(left<right){
            int mid=left+(right-left)/2;
            if(canEat(piles,mid,h)) right=mid;
            else left=mid+1;
        }
        return left;
        
    }
    boolean canEat(int[] piles,int k,int h){
        int noOfHours=0;
        for(int pile: piles){
            if(pile%k==0) noOfHours+=pile/k;
            else noOfHours+=pile/k+1;
        }
        return noOfHours<=h;
    } 
    
}