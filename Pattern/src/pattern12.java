public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        //1st Triangle
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row - 1; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            for(int col = 1; col <= row - 1; col++){
                System.out.print(" ");
            }
            System.out.println();
        }
        // 2nd Triangle
        for(int row = 1; row <= n; row++){
            //space
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            //star
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            //space
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
