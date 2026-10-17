public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        //space
        for(int row = 1; row <= n; row++){
            //space
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            //star
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//                *
//               **
//              ***
//             ****
//            *****

