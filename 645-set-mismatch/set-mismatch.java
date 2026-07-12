class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+1];
        Arrays.fill(arr,0);

        for(int i:nums){
            arr[i] = arr[i] + 1;
        }
        int out[] = new int[2];
        for(int i=0; i<arr.length ;i++){
            if(arr[i] == 2){
                out[0] = i;
            }
            if(arr[i] == 0){
                out[1] = i;
            }
        }
        return out;
        
    }
}