class Solution {
    public boolean isPalindrome(int x) {
            String num = Integer.toString(x);
            int r = num.length() - 1;
            for(int i=0 ; i< num.length()/2 ; i++) {
                if (num.charAt(i) != num.charAt(r))
                    return false;
                r--;
            }
            return true;
        }
}