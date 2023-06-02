public class Solution {
    public int Simplifypath(int m, int n){
            int mat[][] = new mat [m][n];
            int count = 0;
            int dp[][] = new int[m][n];
            int k = helper(mat, 0, 0,m, n, dp);
            return k ;
        }
        public int helper(int mat [][] , int r, int c, int m , int n , int dp){
            if(c >=n || r >= m){
                return 0;
            }
            if(dp[r][c] !=0){
                return dp[r][c];
            }
            if(r== m-1 && c== n-1){
                return 1;
            }
            int cnt1 =helper(mat, r+1, c,m,n, dp);
            int cnt2 = helper(mat, r, c+1, m, n, dp);
            return dp[r][c] = cnt1+cnt2;
        }


    }

