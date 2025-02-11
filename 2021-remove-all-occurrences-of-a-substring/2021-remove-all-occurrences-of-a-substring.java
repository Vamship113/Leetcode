class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder res= new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int strlen=s.length();
        int partlen=part.length();
        for(int i=0;i<strlen;i++){
            stack.push(s.charAt(i));
            if(stack.size()>=partlen && checkMatch(stack,part,partlen)){
                for(int j=0;j<partlen;j++){
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return (res.reverse()).toString();
    }
    boolean checkMatch(Stack<Character> stack,String part,int partlen){
        Stack<Character> temp = new Stack<>();
        temp.addAll(stack);
        for(int i=partlen-1;i>=0;i--){
            if(temp.isEmpty() || temp.peek()!=part.charAt(i)) return false;
            temp.pop();
        }
        return true;
    }
}