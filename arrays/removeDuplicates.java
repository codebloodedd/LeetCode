//MY method

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int a = nums[0];
//         int l = nums.length;
//         int k = 1;
//         int[] expectedNums = new int[l];
//         expectedNums[0] = nums[0];
//         for (int i = 0; i<l; i++){
//           if (nums[i]>a){
//             expectedNums[k] = nums[i];
//             a = nums[i];
//             k++;
//           }
//         }
//       for (int i=0; i<l;i++){
//             nums[i] = expectedNums[i];
//         }
//       return k;
//     }
// }

//Best method

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}