import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {12,34,56,88,23};

        System.out.print("Enter index1: ");
        int index1=in.nextInt();
        System.out.print("Enter index2: ");
        int index2=in.nextInt();

        swap(arr, index1, index2);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}