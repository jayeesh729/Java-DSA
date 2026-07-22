class Solution {

    private int divisorsCalculate(int[] nums, int mid){
        int count = 0;
        for(int n:nums){
            count += (int)Math.ceil((double)n/mid);
        }
        return count;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = 0;

        while(low<=high){
            int mid = (low+high)/2;
            int count = divisorsCalculate(nums,mid);

            if(count <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }    
        return ans;
    }

}