class Solution {
    // for minimum NSE and PSEE
    private int[] NSE(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0 ;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    private int[] PSEE(int arr[]){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n ;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    // for maxinmum NGE and PGEE
    private int[] NGE(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    private int[] PGEE(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n ;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;

    }

    private long subArrayMax(int arr[]){
        int n = arr.length;
        int nge[] = NGE(arr);
        int pgee[] = PGEE(arr);
        long sum = 0;

        for(int i=0; i<n ;i++){
            int left = i - pgee[i];
            int right = nge[i] - i;
            long freq = left * right * 1L;
            sum = (freq * arr[i]) + sum ;
        }
        return sum;
    }

    private long subArrayMin(int arr[]){
        int n = arr.length;
        long sum = 0;
        int[] psee = PSEE(arr);
        int[] nse = NSE(arr);

        for(int i=0; i<n; i++){
            int left = i - psee[i];
            int right = nse[i] - i;
            long freq = left * right * 1L;
            sum = sum + (freq * arr[i]);
        }
        return sum;
    }

    public long subArrayRanges(int[] nums) {
        return subArrayMax(nums) - subArrayMin(nums) ;
        
    }
}