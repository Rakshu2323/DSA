import java.util.*;
class Solution {
    public int helper(int n, int cb[]) {
        if(n==0) return 1;
        if(n<0) return 0;
        if(cb[n]!=-1) return cb[n];
        return cb[n]=helper(n-1,cb)+helper(n-2,cb);
    }
    public int climbStairs(int n){
        int[] cb = new int[n+1];
        Arrays.fill(cb,-1);
        return (helper(n,cb));
    }
}