class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        
        int n = s.length();
        int m = t.length();
        
        if( n!= m){
            return false;
        }

        for(int i=0; i<n ;i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(map.containsKey(ch)){
                if(map.get(ch) != ch2){
                    return false;
                }
            }
            else{
                map.put(ch, ch2);
            }
        
            if (map2.containsKey(ch2)) {
                if (map2.get(ch2) != ch)
                    return false;
            } else {
                map2.put(ch2, ch);
            }
        }
        return true;
    }
}