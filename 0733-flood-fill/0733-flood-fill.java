class Solution {

    private void dfs(int sr, int sc, int[][] ans, int[][] image, int color,
    int[] delRow, int[] delCol ,int iniColor){
        int m = image.length;
        int n = image[0].length;

        ans[sr][sc] = color;
        for(int i=0 ; i<4; i++){
            int nrow = sr + delRow[i];
            int ncol = sc + delCol[i];

            if(nrow>=0 && ncol>=0 && ncol<n && nrow<m &&
            image[nrow][ncol] == iniColor && ans[nrow][ncol] != color){
                dfs(nrow, ncol, ans, image, color,delRow ,delCol ,iniColor);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int iniColor = image[sr][sc];
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        dfs(sr, sc, ans, image, color, delRow, delCol, iniColor);

        return ans; 
    }
}