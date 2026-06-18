import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i -1;
            int maxIndex = maxElementIndex(arr,0,last);
            swapValues(arr,maxIndex,last);
        }
    }

    static int maxElementIndex(int[] arr, int start, int last){
        int maxValue = Integer.MIN_VALUE;
        int i;
        int maxIndex = 0;
        for(i=0; i<=last; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swapValues(int[] arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
