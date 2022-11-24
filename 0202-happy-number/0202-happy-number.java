class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }while(slow != fast);
        if (slow == 1)
            return true;
        return false;
    }
    public int squareSum(int n) {
        int res = 0;
        while(n != 0) {
            res+=Math.pow(n%10, 2);
            n/=10;
        }
        return res;
    }
}