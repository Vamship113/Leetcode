class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max_pile=0;
        for(int pile: piles)
        max_pile=Math.max(max_pile,pile);
        // initialise left and right
        int left=1,right=max_pile;
        // System.out.println(left+" "+right);
        while(left<=right){
            int mid=left+(right-left)/2;
            if(checkValid(piles,mid,h)) right=mid-1;
            else left=mid+1;

            // System.out.println(left+" "+right+" "+mid);
        }
        return left;

    }
    boolean checkValid(int[] piles, int mid, int hrs) {
        long count = 0; // use long to avoid overflow
        for (int pile : piles) {
            count += (pile + mid - 1) / mid; // ceiling division
            if (count > hrs) return false; // early stop if already over time
        }
        return count <= hrs;
    }

}