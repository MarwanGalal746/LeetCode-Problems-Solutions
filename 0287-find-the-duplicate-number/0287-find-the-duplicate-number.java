class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[100000+2];
        for (int i=0 ; i<nums.length ; i++) {
            if(visited[nums[i]] == false)
                visited[nums[i]] = true;
            else return nums[i];;
        }
        return 0;
    }
}