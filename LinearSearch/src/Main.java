import java.util.Scanner;
//LINEAR SEARCH
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Size of the Array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter ARRAY ELEMENTS: ");
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the TARGET Element: ");
        int tar = in.nextInt();

        int ans = linearSearch(arr, size, tar);
        System.out.print(ans);
    }

    static int linearSearch(int[] arr, int size, int tar){
        for(int i=0; i<size; i++){
            if(arr[i] == tar){
                return i;
            }
        }
        return -1;
    }
}