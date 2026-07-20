class Solution {

    private int firstOccurrence(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int index = -1;
        while(left<=right){
            int mid = (left + right) /2;

            if(nums[mid] == target){
                index = mid;
                right = mid -1;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else{
                right = mid - 1;
            }
        }
        return index;
    }

    private int lastOccurrence(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int index = -1;
        while(left<=right){
            int mid = (left + right) /2;

            if(nums[mid] == target){
                index = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else{
                right = mid - 1;
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);
        return new int[]{ first,last};
      
    }
}