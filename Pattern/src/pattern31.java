public class pattern31 {
    public static void main(String[] args) {
        int n = 4;
        for(int row=1; row<=2*n-1; row++){
            for(int col=1; col<=2*n-1; col++){
                int N = 2*n - 1;
                int left = col - 1;
                int top = row - 1;
                int right = N-left-1;
                int bottom = N-top-1;
                int atEveryIndex = n - (Math.min(Math.min(left,right),Math.min(top,bottom)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
