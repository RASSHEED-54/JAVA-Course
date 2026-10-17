public class pattern16 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print("  ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
