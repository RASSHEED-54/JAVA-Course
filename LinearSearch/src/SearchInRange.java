public class SearchInRange {
    public static void main(String[] args) {

       int[] arr = {12,34,56,89,100};

       int target = 34;

       int ans = search(arr, target, 1, 4);

        System.out.println(ans);

    }
    static int search(int[] arr, int target, int start, int end){
        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
