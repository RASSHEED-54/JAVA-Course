public class CheckArraySorted {
    public static void main(String[] args) {
        int[] nums = {0};
        if(isSorted(nums,0)){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is NOT Sorted");
        }


    }

    static boolean isSorted(int[] nums, int index){
        if(index == nums.length - 1){
            return true;
        }
        return nums[index] <= nums[index+1] && isSorted(nums,++index);
    }

}
