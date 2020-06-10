class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        char c=s.charAt(0);
        int k=t.indexOf(c);
        if(k<0) return false;
        return isSubsequence(s.substring(1),t.substring(k+1));
    }
}
