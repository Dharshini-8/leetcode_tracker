// Last updated: 7/9/2026, 9:26:25 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j] * 2){
                    return true;
                }
            }
        }
        return false;
    }
}