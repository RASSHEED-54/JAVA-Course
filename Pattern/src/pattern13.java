public class pattern13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            if (i == n) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("* ");
                for (int j = 1; j < 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                if (i != 1) System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//               *
//              * *
//             *   *
//            *     *
//           *********

