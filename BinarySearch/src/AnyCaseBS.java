import java.util.Scanner;
public class AnyCaseBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Array Elements in");
        System.out.println("Ascending / Descending Order");
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter Element to be Searched:" );
        int target = input.nextInt();

        if(binarySearch(arr,target)){
            System.out.println(target + " found in Array !");
        }
        else{
            System.out.println(target + " NOT found in Array");
        }
    }
    static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = (start + end)/2;
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else if(target > arr[mid]){
                    end = mid - 1;
                }
            }
            if(target == arr[mid]){
                return true;
            }
        }
        return false;
    }
}
