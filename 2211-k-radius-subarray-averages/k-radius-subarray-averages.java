class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] avg = new int[nums.length];
        Arrays.fill(avg,-1);
        int win = (2*k)+1;
        if(win>nums.length) return avg;
        long sum = 0;
        for(int i=0; i<win; i++){
            sum += nums[i];
        }
        avg[k] = (int)(sum/win);
        for(int i=k+1; i<=nums.length-1-k; i++){
            sum += nums[i+k];
            sum -= nums[i-k-1];
            avg[i] = (int)(sum/win);
        }
        return avg;
    }
}