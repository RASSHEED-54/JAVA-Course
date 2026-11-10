public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 7;
        int ans = BS(arr,0,arr.length - 1, target);
        System.out.println(ans);
    }

    static int BS(int[] arr,int s, int e, int target){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return  BS(arr,s,mid - 1,target);
            }
            return BS(arr,mid + 1,e,target);
        }
        if(target >= arr[mid] && target <= arr[e]){
            return BS(arr,mid + 1, e, target);
        }
        return BS(arr,s,mid - 1, target);
    }
}
