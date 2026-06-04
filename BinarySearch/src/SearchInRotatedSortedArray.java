public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        int target = 6;
        System.out.println(search(arr,target));
    }
    static int findPivotElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int search(int[] arr, int target){
        int pivot = findPivotElement(arr);

        if(pivot == -1){
            return binarySearch(arr,target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            if(pivot == 0){
                return binarySearch(arr,target,0,0);
            }
            return binarySearch(arr,target,0,pivot - 1);
        }
        else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }


    static int binarySearch(int[] list, int target, int start, int end){
        while(start <= end){
            int mid = (start + end)/2;
            if(target > list[mid]){
                start = mid + 1;
            }
            else if(target < list[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}