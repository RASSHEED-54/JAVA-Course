public class pattern30 {
    public static void main(String[] args) {
        int N = 5;
        for(int row = 1; row <= N; row++){
            for(int col = 1; col <= N-row; col++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            for(int col = 1; col <= N-row; col++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//                  1
//                2 1 2
//              3 2 1 2 3
//            4 3 2 1 2 3 4
//          5 4 3 2 1 2 3 4 5
