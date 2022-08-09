class Solution {
    public static boolean isPalindrome(int x) {
        int reversedNum = 0; int remainder = 0;
        int originalNum = x;
        if(x<0){
            return false;
        }
        while(x != 0){
            remainder = x % 10;
            reversedNum = reversedNum*10+remainder;
            x/=10;
        }
        if(originalNum == reversedNum){
            return true;
        }
        else return false;
    }
}
