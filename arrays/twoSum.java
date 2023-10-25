import java.util.*;

//Brute Force
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length; 
//         int output[] = new int[2];
//         for (int i = 0;  i<n; i++){
//             output[0] = i;
//             for(int j = i+1; j<n;j++){
//                 if ( nums[i]+ nums[j] == target){
//                     output[1] = j;
//                     return output;
//                 }
//             }
//         }
//         output[0] = -1 ;
//         output[1] = -1 ;
//         return output;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            int curr = nums[i];
            int x = target - curr;
            if (map.containsKey(x)){
                return new int[] {map.get(x), i};
            }
            map.put(curr, i);
        }
        return null;
    }
}