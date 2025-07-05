class Solution {
    public int findLucky(int[] arr) {
        int[] freq= new int[501];
        for(int num : arr){
            freq[num]++;
        }
        int lucky=-1;
        Set<Integer> set= new HashSet<>();
        for(int i=1;i<=500;i++){
            if(freq[i]==i) lucky=Math.max(lucky,i);
        }
        return lucky;
    }
}