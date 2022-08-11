class Solution {
    public int findLucky(int[] arr) {
        int[] newArr = new int[501];
        int max = -1;
        for(int i = 0; i<arr.length; i++){
            ++newArr[arr[i]];
        }
        for(int i = 1; i < 501; i++){
            if(i == newArr[i])
                max = Math.max(max, i);
        }
        return max;
    }
}
