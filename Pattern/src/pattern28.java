public class pattern28 {
    public static void main(String[] args) {
        int N = 5;
        for(int row = 1; row < 2*N; row++){
            int space = (row > N) ? row - N : N - row ;
            int stars = (row > N) ? 2*N - row : row ;
            for(int col = 1; col <= space; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= stars; col++){
                System.out.print("* ");
            }
            for(int col = 1; col <= space; col++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
