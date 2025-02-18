class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb=new StringBuilder();
        int n=pattern.length();
        int start=1;
        int last=n+1;
        int i=0;
        while(i<n){
            char c= pattern.charAt(i);
            if(c=='I')
            {
            sb.append(start++);
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }}
            else{
                stack.push(start++);
            }
            i++;
        }
        sb.append(start++);
        while(!stack.isEmpty()){
                sb.append(stack.pop());
        }
        return sb.toString();
    }
}