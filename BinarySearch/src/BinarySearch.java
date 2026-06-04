import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = {6,7,1,2,3,4,5};
        System.out.print("Enter element to be search: ");
        int target = sc.nextInt();
        if(binarySearch(list,target)){
            System.out.println(target + " found");
        }
        else{
            System.out.println(target + " NOT found");
        }
    }
    static boolean binarySearch(int[] list, int target){
        int start = 0;
        int end = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if(target > list[mid]){
                start = mid + 1;
            }
            else if(target < list[mid]){
                end = mid -1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
