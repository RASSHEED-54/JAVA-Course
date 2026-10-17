public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            System.out.print("* ");
            for (int j = 1; j < 2 * i - 3; j++) {
                System.out.print(" ");
            }
            if (i != 1) System.out.print("* ");
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            //space
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 1; col <= 2 * n - 2 * row - 1; col++) {
                System.out.print(" ");
            }
            if (row != n) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//                *
//               * *
//              *   *
//             *     *
//            *       *
//             *     *
//              *   *
//               * *
//                *
