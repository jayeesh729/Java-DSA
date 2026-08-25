class Solution {
    private int helper(int nums[], int k){
        int left = 0;
        int right = 0;
        int n = nums.length;
        int OddCount = 0;
        int count = 0;

        while(right < n){
            if(nums[right]%2 !=0){
                OddCount++;
            }
            while(OddCount > k){
                if(nums[left]%2 != 0){
                    OddCount--;    
                }
                left ++;
            }
            count = count + right - left + 1;
            right++;
        }
        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k-1);
    }
}