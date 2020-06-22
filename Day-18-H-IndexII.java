class Solution {
    public int hIndex(int[] citations) {
        if(citations.length == 0 ||  citations[citations.length-1] == 0) return 0;
        int low = 0;
        int high = citations.length-1;
        int N = citations.length;
        
          
        while(low < high)
        {
            int mid = low + (high-low)/2;
            
            if(N-mid > citations[mid])
            {
                low = mid+1;
            }
            else high = mid;
        }
        
        return N-low;
        
    }
}
