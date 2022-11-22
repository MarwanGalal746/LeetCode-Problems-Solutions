class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left  = 0;
        int right = arr.length -1;
        int mid = 0;
        while (left <= right) {
            mid  = left + (right - left)/2;
            if (mid != 0 && mid != arr.length-1) {
                if (arr[mid-1] < arr[mid] && arr[mid +1] < arr[mid]) {
                    break;
                } else if (arr[mid-1] < arr[mid] && arr[mid +1] > arr[mid]) {
                    left = mid +1;
                } else if (arr[mid-1] > arr[mid] && arr[mid +1] < arr[mid]) {
                    right = mid;
                }
            }
        }
        return mid;
        
    }
}