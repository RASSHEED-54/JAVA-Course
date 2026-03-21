import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initializing 3 the internal List inside the External List
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //Initializing 3 element inside each Internal List
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
