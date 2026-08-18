class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.getOrDefault(nums[i],0)>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}