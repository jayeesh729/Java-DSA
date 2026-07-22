class Solution {

    private int countBouquets(int[] arr, int m, int k, int mid){
        int cnt = 0;
        int count = 0;

        for(int flower: arr){
            if(flower <= mid){
                cnt++;
            }
            else{
                cnt = 0;
            }
            if(cnt == k){
                count += cnt / k;
                cnt = 0;
            }
        }
        return count;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int high = Arrays.stream(bloomDay).max().getAsInt();    
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int ans = 0;


        if((long)m*k > bloomDay.length) return -1;
        while(low<=high){
            int mid = (low + high)/2;
            int c = countBouquets(bloomDay, m, k, mid);
            if( c >= m){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}