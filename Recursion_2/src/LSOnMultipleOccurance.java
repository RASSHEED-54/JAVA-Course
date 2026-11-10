import java.util.ArrayList;

public class LSOnMultipleOccurance {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,56};
        int target = 3;
//        search(arr,target,0);
//        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> ans = search1(arr,0,target,list1);
        System.out.println(ans);
    }

    static ArrayList<Integer> list = new ArrayList<>();


    static void search(int[] arr, int target, int i){
        if(i == arr.length -1){
            return;
        }
        if(arr[i] == target){
            list.add(i);
        }
        search(arr,target,i+1);
    }

    static ArrayList<Integer> search1(int[] arr, int i, int target, ArrayList<Integer> list1){
        if(i == arr.length){
            return list1;
        }
        if(arr[i] == target){
            list1.add(i);
        }
        return search1(arr,i+1,target,list1);
    }
}
