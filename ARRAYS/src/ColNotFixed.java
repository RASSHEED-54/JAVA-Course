import java.util.Scanner;
public class ColNotFixed {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // IN CASE IF NO COLUMN IS NOT FIXED -> IRREGULAR MATRIX
        //Example :
        /*
         * 1 2 3
         * 4 6
         * 7 8 9 10
         * */

        int [][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for(int[] inArr : arr){
            for(int ele : inArr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
