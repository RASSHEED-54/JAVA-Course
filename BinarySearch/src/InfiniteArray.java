import java.sql.SQLOutput;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30,35};
        int target = 35;
        System.out.println(binarySearch(arr,target));
    }
    static int searchRange(int[] arr, int target,boolean firstIndex){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1; // New start
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        if(firstIndex){
            return start;
        }
        else{
            return end;
        }
    }

    static int binarySearch(int[] arr , int target){
        int start = searchRange(arr,target,true);
        int end = searchRange(arr,target,false);
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
