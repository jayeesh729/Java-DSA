class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // first part 
        for(int i=n-2; i>=0 ;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        // if no index is found 
        if(index == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }

        // second part 
        for(int i=n-1; i>index ;i--){
            if(nums[i] > nums[index]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        // reverse the remaining 
        reverse(nums, index+1, n-1);
    }
    private void reverse(int arr[], int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}