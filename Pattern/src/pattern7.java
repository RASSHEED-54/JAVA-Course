public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++){
            //space
            for(int col = 1; col <= row - 1; col++){
                System.out.print(" ");
            }
            //star
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//        *****
//         ****
//          ***
//           **
//            *