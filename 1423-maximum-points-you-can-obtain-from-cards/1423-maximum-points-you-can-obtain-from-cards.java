class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for(int x: cardPoints){
            total += x;
        }
        if(k == n)return total;
        int windowsize = n - k;

        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        while(right < n){
            sum = sum + cardPoints[right];
            if(right - left + 1 == windowsize){
                min = Math.min(sum , min);
                sum = sum - cardPoints[left];
                left++;
            }
            right++;
        }
        return total - min;
    }
}