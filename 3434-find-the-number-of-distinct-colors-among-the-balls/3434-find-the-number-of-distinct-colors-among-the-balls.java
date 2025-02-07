class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> color = new HashMap<>();
        Map<Integer, Integer> pos = new HashMap<>();
        int i=0;
        int[] result= new int[queries.length];
        for(int[] query: queries){
            int x=query[0];
            int y=query[1];
            if(pos.containsKey(x)){
                int a=pos.get(x);
                color.put(a, color.get(a) - 1);
                if(color.get(a)==0) color.remove(a);
            }           
            pos.put(x,y);
            color.put(y, color.getOrDefault(y, 0) + 1);
            result[i++]=color.size();
            }
            return result;
        }
    
    }
