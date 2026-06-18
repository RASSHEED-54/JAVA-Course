import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,6,8,3,2,7,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
