import java.util.Scanner;

public class FloorOfTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,5,14,16,25};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Target: ");
        int target = input.nextInt();

        int ans = floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
