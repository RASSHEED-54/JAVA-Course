import java.util.ArrayList;

public class AnsFromBelowCalls {
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,4,5,6};
        int target = 4;

        System.out.println(search(arr,0,target));

    }

    static ArrayList<Integer> search(int[] arr, int i, int target){
        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> ans = search(arr,i+1,target);

        list.addAll(ans);

        return list;

    }
}
