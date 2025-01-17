class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum=0;
        for(int num:derived)
        sum^=num;
        return sum==0?true:false;
    }
}