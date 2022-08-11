class Solution {
    public boolean isHappy(int n) {
        int result;
        int count = 0;
        while(true){
             count++;
            
            result = squareSum(n);
             n = result; 
             if(result == 1)break;
            if(count >= 100){
                return false;
            }

        }
        return true;
        
    }
    public static int squareSum(int n){
        int sum = 0;
        while(n != 0){
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
