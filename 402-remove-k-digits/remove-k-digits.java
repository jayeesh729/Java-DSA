class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();

        for(int i=0; i<n ;i++){
            while(!st.isEmpty() && k>0 && st.peek() > num.charAt(i)){
                k--;
                st.pop();
            }
            st.push(num.charAt(i));
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }
        
        // Add digits from stack to result
        StringBuilder res = new StringBuilder();
        boolean leadingZero = true;

        for(int i=0 ; i<st.size() ; i++){
            char ch = st.get(i);
            if(leadingZero && ch == '0'){
                continue;
            }
            leadingZero = false;
            res.append(ch);
        }
        if(res.length() == 0){
            return "0";
        }
        return res.toString();



    }
}