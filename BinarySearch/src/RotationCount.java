public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {10,12,1,2,3,4};
        int pivot = findPivot(nums);
        System.out.println(pivot + 1);
    }
    static int findPivot(int[] nums){
         int start = 0;
         int end = nums.length;

         while(start <= end){
             int mid = start + (end - start)/2;

             if(mid < end && nums[mid] > nums[mid + 1]){
                 return mid;
             }
             if(mid > start && nums[mid - 1] > nums[mid]){
                 return mid - 1;
             }
             if(nums[start] > nums[mid]){
                 end = mid - 1;
             }
             else{
                 start = mid + 1;
             }
         }
         return -1;
    }
}
