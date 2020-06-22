class Solution {
    public String longestDupSubstring(String S) {
        int length = S.length();
        
        int[] nums = new int[length];
        
        for(int i=0; i<length; ++i) nums[i] = (int)S.charAt(i) - (int)'a';
        
        int a = 26;
        
        long mod = (long)Math.pow(2,32);
        
        int left =1;
        int right = length;
        int L;
        
        while(left!=right) {
            L = left+ (right-left)/2;
            if(RKP(L, a, mod, length, nums)!=-1) left= L+1;
            else right = L;
        }
        
        int start = RKP(left-1, a, mod, length, nums);
        return start!= -1? S.substring(start, start + left -1) : "";
    }
    public int RKP (int L, int a, long mod, int length, int[] nums) {
        long h =0;
        
        for(int i=0; i<L;++i) h = (h* a +nums[i]) % mod;
        
        HashSet<Long> seen = new HashSet();
        seen.add(h);
        
        long aL = 1;
        for(int i=1; i<=L; ++i) aL = (aL * a) % mod;
        
        for(int start = 1; start <length-L+1; ++start){
            h = (h * a- nums[start -1] * aL %mod + mod) %mod;
            h = (h + nums[start + L -1])%mod;
            if(seen.contains(h)) return start;
            seen.add(h);
        }
        return-1;
    }
}
