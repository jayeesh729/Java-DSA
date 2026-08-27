class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        int len = 0;
        int maxlen = 0;
        int n = nums.length;
        while(right < n){
            if(nums[right] == 0 && count <= k){
                count ++;
            }
            while( count > k){
                if(nums[left] == 0){
                    count --;
                }
                left ++;
            }
            len = right - left +1;
            maxlen = Math.max(maxlen, len);
            right ++;
        }
        return maxlen;
    }
}