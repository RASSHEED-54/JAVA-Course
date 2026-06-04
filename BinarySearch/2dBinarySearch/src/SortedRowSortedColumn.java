import java.util.Arrays;

public class SortedRowSortedColumn {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,23,37,43},
                {16,27,38,45},
                {19,29,39,49}
        };
        int target = 27;
        System.out.println(Arrays.toString((binarySearch(arr,target))));
    }
    static int[] binarySearch(int [][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;
        while(row <= matrix.length -1 && column >= 0){
            if(matrix[row][column] == target){
                return new int[]{row,column};
            }
            if(matrix[row][column] > target){
                column--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}