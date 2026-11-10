public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,78,90};
        int target = 3;
        if(search(arr,0,target)){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target Not Found");
        }
        System.out.println(searchFirst(arr,0,target));
        System.out.println(searchLast(arr,arr.length-1,target));
    }
    static boolean search(int[] arr, int i, int target){
        int n = arr.length;
        if(i == n){
            return false;
        }
        return arr[i] == target || search(arr,i+1,target);
    }

    static int searchFirst(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return searchFirst(arr,i+1,target);
    }

    static int searchLast(int[] arr, int i, int target){
        if(i == -1){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return searchLast(arr,i-1,target);
    }

}
