public class pattern17 {
    public static void main(String[] args) {
        int N = 6;
        for(int row = 1; row < 2*N; row++){

            int c = (row > N)? 2*N - row : row ;
            int sp = (row > N)? row - N : N - row ;

            for(int col = 1; col <= sp; col++){
                System.out.print(" ");
            }
            for(int col = c; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= c; col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
//          1
//         212
//        32123
//       4321234
//        32123
//         212
//          1

