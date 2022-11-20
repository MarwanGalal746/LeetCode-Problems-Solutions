class Solution {
        public int search(int[] nums, int target) {
            int start = 0;
            int end  = nums.length;
            int mid  = start + (end - start)/2;            
            while (start<end) {
                if(nums[mid] == target)
                    return mid;
                else if (nums[mid] > target)
                    end = mid;
                else if (nums[mid] < target)
                    start = mid +1;
                mid = start + (end - start)/2;
            }
            return -1;
        }
    }