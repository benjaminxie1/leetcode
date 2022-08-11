class Solution {
    public int findNumbers(int[] nums) {
        int evenNumbers = 0;
        for(int i = 0; i<nums.length; i++){
            if(countDigit(nums[i]) % 2 == 0){
                evenNumbers++;
            }
        }
        return evenNumbers;
    }
    public static int countDigit(int num){
            int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
