class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];

        if( n==1){
            return nums[0];
        }
        if (n == 2) return Math.max(nums[0], nums[1]);
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<n-1 ;i++){
            dp[i] = Math.max(dp[i-1] , nums[i] + dp[i-2]);
        }
        int firstIncluded = dp[n-2];

        Arrays.fill(dp, 0);
        
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1],nums[2]);
        for(int i=3; i<nums.length ;i++){
            dp[i] = Math.max(dp[i-1] , nums[i]+dp[i-2]);
        }
        int lastIncluded = dp[n-1];
        return Math.max(firstIncluded, lastIncluded);
    }
}