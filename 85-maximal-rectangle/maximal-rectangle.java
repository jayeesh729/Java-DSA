class Solution {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            // When current bar is less than the bar on top of stack, calculate area
            while (!stack.isEmpty() && (i == n || heights[stack.peek()] >= (i < n ? heights[i] : 0))) {
                int height = heights[stack.pop()];

                int width;
                if (stack.isEmpty()) {
                    width = i; // All previous were taller
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int height[] = new int[m];
        Arrays.fill(height, 0);

        for(int i =0; i<n; i++){
            for(int j=0; j<m ;j++){
                if(matrix[i][j] == '1'){
                    height[j]++; 
                }
                else{
                    height[j] = 0;
                }
            }
            int area = largestRectangleArea(height);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}