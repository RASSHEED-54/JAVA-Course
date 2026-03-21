import java.util.Arrays;
// PASS BY REFERANCE
public class Swapref {
    public static void main(String[] args) {
        int [] arr = {1,2,34,5,7,90};

        change(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 10000;
        System.out.println(Arrays.toString(nums));
    }
}
