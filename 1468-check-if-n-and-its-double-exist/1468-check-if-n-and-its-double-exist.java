class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set= new HashSet<>();
        set.add(arr[0]);
        for(int i=1;i<arr.length;i++){
        	if(arr[i]%2==0)
        	{
            if(set.contains(arr[i]/2) || set.contains(arr[i]*2))
            return true;
        }   
        	else {
        		if(set.contains(arr[i]*2))
                    return true;
        	}
            set.add(arr[i]);
            
        }
        return false;
        
    }
}