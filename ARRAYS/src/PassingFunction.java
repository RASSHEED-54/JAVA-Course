import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int [] nums = {12,34,56,78,100};
        System.out.print("BEFORE FUNCTION CALL: ");
        System.out.println(Arrays.toString(nums));

        change(nums);

        System.out.print("AFTER FUNCTION CALL: ");
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr ) {
        arr[0] = 99;
        System.out.print("INSIDE CHANGE FUNCTION: ");
        System.out.println(Arrays.toString(arr));
    }
}
