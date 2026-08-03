class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        int n = magazine.length();

        for(int i=0; i<n ;i++){
            map.put(magazine.charAt(i) ,map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        int m = ransomNote.length();
        for(int j=0; j<m ;j++){
            char ch = ransomNote.charAt(j);
            if(map.getOrDefault(ch,0) > 0){
                map.put(ch, map.get(ch)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}