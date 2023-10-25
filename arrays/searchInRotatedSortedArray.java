class Solution {
    // int getPivot(int[] nums){
    //     int f = 0;
    //     int l = nums.length-1;
    //     int m;
    //     int next;
    //     while(f<=l){
    //         m = f + (l - f) / 2;
    //         next = (m+1)%nums.length;
    //         if(nums[m]>nums[next]){
    //             return next;
    //         }
    //         if(nums[m]<nums[f]){
    //             l = m;
    //         }
    //         else{
    //             f = m+1;
    //         }
    //     }
    //     return 0;
    // }
    // public int search(int[] nums, int target) {
    //     int p = getPivot(nums);
    //     int n = nums.length;
    //     int f = 0;
    //     int l = n -1;
    //     while(f<=l){
    //         int m = (f+l)/2;
    //         int nf = (f+n-p)%n;
    //         int nl = (l+n-p)%n;
    //         int nm = (m+n-p)%n;
    //         if(nums[nm]<target){
    //             f = m +1;
    //         }
    //         else if(nums[nm]>target){
    //             l = m-1;
    //         }
    //         else{
    //             return nm;
    //         }
    //     }
    //     return -1;
    // }

    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[l]<=nums[mid]){
                if(target >= nums[l] && target < nums[mid]){
                    h = mid-1;
                }
                else{
                    l = mid +1;
                }
            }
            else{
                if(target <= nums[h] && target > nums[mid]){
                    l = mid + 1;
                }
                else{
                    h = mid -1;
                }
            }
        }
        return -1;
    }
}