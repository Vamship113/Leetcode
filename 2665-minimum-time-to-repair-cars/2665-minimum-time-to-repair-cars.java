class Solution {
    public long repairCars(int[] ranks, int cars) {
        long min = Integer.MAX_VALUE;
        for(int rank : ranks )
        min=Math.min(min,rank);
        long left=1;
        long right=min*cars*cars;
        System.out.println(left+" "+right);
        while(left<right){
            long mid=left+(right-left)/2;
            if(canRepair(ranks , cars , mid)){
                right=mid;
            }
            else
            left=mid+1;
        }

        return left;
        
    }

    boolean canRepair(int[] ranks, int cars, long time){
        long count=0;
        for(int rank : ranks ){
            count+=(long)Math.sqrt(time/rank);
        }
        return count>=cars;
    }
}