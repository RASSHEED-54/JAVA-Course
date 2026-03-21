import java.util.Scanner;
public class MultiDimArray {
    public static void main(String[] args) {
        // 2D ARRAY
        int row, col;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter No Of ROWS: ");
        row = in.nextInt();
        System.out.print("Enter No Of COLUMNS: ");
        col = in.nextInt();

        int[][] arr = new int[row][col];

        // TAKING INPUT FROM USER
        for(int i=0 ; i<row; i++){
            for(int j=0 ; j<col; j++){
                arr[i][j] = in.nextInt();
            }
        }
        // PRINTING MATRIX
        for(int i=0 ; i<row; i++){
            for(int j=0 ; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
