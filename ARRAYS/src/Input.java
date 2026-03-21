import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String[] args) {
        //GETTING INPUT FROM USER
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size Of the ARRAY: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
