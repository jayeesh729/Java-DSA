class Solution {
    public int reverse(int x) {
        int ans = 0;
        boolean neg = false;
        if(x<0){
            neg = true;
            x = 0-x;
        }
        while(x!=0){
            long check=ans;
            check = check * 10;
            if( check>Integer.MAX_VALUE || check<Integer.MIN_VALUE){
                return 0;
            }
            ans = ans * 10;
            ans = ans + (x%10);
            x = x/10;
        }
        if(neg){
            return (ans * -1);
        }
        return ans;
        
    }
}