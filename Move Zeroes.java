class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == 0){ 
                for (int j = i+1; j<=nums.length-1; j++){
                    if (nums[j] == 0) {
                        continue;
                    } else {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}
