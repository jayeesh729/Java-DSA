class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int max = Arrays.stream(nums).max().getAsInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n ;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for (int num:nums){
            if( map.get(num) == 1){
               return num;
            }
        }
        return -1;
    }
}