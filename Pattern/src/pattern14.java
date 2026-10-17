public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++){
            //space
            for(int col = 1; col <= row - 1; col++){
                System.out.print(" ");
            }
            if(row == 1){
                for(int col = 1; col <= 2*n - 1; col++){
                    System.out.print("*");
                }
            }
                System.out.print("*");
                for(int col = 1; col <= 2*n - 2*row - 1; col++){
                    System.out.print(" ");
                }
                if(row != n){
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
//            *********
//             *     *
//              *   *
//               * *
//                *
