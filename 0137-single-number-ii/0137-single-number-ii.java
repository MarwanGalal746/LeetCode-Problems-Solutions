class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int mask = 0, sum = 0;
        for (int i=0 ; i< 32 ; i++) {
            mask = 1 << i;
            sum = 0;
            for (int r = 0 ; r<nums.length ; r++) {
                if ((nums[r] & mask) != 0) sum ++;
            }
            if (sum %3 != 0) res |= mask;
        }
        return res;
    }
}