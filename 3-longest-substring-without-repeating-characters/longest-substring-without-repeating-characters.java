import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxlen = 0;

        int hash[] = new int[256];
        Arrays.fill(hash, -1);

        while(right < n ){
            if(hash[s.charAt(right)] != -1){
                if(hash[s.charAt(right)] >= left){
                    left = hash[s.charAt(right)] + 1;
                }
            }
            int len = right - left + 1; 
            maxlen = Math.max(maxlen, len);
            hash[s.charAt(right)] = right;
            right++;
        }
        return maxlen;
        
        
    }
}