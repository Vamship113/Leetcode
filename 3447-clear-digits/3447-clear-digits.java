class Solution {
    public String clearDigits(String s) {
        StringBuilder res= new StringBuilder();
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                res.deleteCharAt(res.length()-1);
            }
            else res.append(c);
        }
        return res.toString();
    }
}