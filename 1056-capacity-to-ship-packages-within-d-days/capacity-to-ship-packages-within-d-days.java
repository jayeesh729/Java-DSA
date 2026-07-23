class Solution {

    private int calculateDays(int weights[], int mid){
        int sum = 0;
        int days = 1;
        for(int x: weights){
            if( sum + x <= mid){
                sum = sum + x;
            }
            else{
                days = days + 1;
                sum = x;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = 0;
        int ans = 0;

        for(int x:weights){
            high += x; 
        }
        
        while(low <= high){
            int mid = (low+high)/2;
            int count = calculateDays(weights, mid);

            if(count <= days){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}