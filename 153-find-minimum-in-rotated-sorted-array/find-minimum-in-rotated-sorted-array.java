class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int min = Integer.MAX_VALUE;

        while(left < right){
            int mid = left + (right - left) / 2;
            // left half sorted 
            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        
        return nums[left];
    }
}