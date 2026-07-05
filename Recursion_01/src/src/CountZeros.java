public class CountZeros {
    public static void main(String[] args) {
        int ans  = countZeros(19010, 0);
        System.out.println(ans);
    }
    static int countZeros(int n, int count){
        if(n == 0){
            return count;
        }
        int r = n % 10;
        if(r == 0){
            count++;
        }
        return countZeros(n/10,count);
    }
}
