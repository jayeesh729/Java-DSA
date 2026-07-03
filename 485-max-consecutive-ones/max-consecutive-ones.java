import java.util.*;


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxOne = 0;
        for(int i=0; i<nums.length ;i++){
            if(nums[i] == 1){
                cnt ++;
                maxOne = Math.max(cnt,maxOne);
            }
            else{
                cnt = 0;
            }
        }
        return maxOne;
    }
}