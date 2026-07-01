class Solution {
    public int majorityElement(int[] nums) {
        // voting algorithm
        int cnt = 0;
        int el = 0;
        for(int i=0; i<nums.length ;i++){
            if(cnt == 0){
                el = nums[i];
                cnt = 1;
            }
            else if(nums[i] == el){
                cnt ++;
            }
            else{
                cnt --;
            }
        }
        int cnt1=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == el){
                cnt1++;
            }
        }
        if( (nums.length / 2) < cnt1 ){
            return el;
        }
        return -1;
    }
}