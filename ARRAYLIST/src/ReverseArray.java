import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;
        reverseArray(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr, int st, int ed){
        while(st < ed){
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }
}
