class Solution {
    public int searchInsert(int[] nums, int target) {
            if (target > nums[nums.length-1]) {
                return nums.length;
            } else if (target < nums[0]) {
                return 0;
            }
            int left = 0 ;
            int right = nums.length-1;
            int mid = 0;
            int minVal = nums[nums.length-1];
            int minInd = 0;
            boolean found = false;
            while(left <= right) {
                mid = left + (right - left)/2;
                if (nums[mid] == target) {
                    found = true;
                    break;
                }
                else if (nums[mid]<target) {
                    left = mid + 1;
                } else {
                    right = mid -1;
                    if (nums[mid] > target && nums[mid] <= minVal) {
                        minVal = nums[mid];
                        minInd = mid;
                    }
                }
            }
            if (found) {
                return mid;
            }
            return minInd;
        }
}