class Solution {
    public boolean validMountainArray(int[] arr) {
        int climb = 0;
            while(climb < arr.length-1 && arr[climb] < arr[climb+1]){
                climb++;
            }
            if(climb == 0 || climb == arr.length-1){
                return false;
            }
            while(climb < arr.length-1 && arr[climb] > arr[climb+1]){
                climb++;
            }
            if(climb == arr.length-1){
                return true;
            }
        else return false;
    }
}
