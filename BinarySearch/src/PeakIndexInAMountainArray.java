// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/?envType=problem-list-v2&envId=w690th66

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
                // mid may be the possible answer as we are moving towards the larger element
            }
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
                //mid itself being smaller , so we are moving to mid + 1;
            }
        }
        // st and end pointer points towards Largest element
        return start;
    }
}