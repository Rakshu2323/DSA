class Solution {
    public void moveZeroes(int[] nums) {
        int rev = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[rev] = nums[i];
                rev++;
            }
        }
        while(rev<nums.length){
            nums[rev] = 0;
            rev++;
        }
    }
}