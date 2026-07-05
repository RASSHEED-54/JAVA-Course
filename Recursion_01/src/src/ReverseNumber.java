public class ReverseNumber {
    public static void main(String[] args) {
        int ans = reverse(1234,0);
        System.out.println(ans);
    }
    static int reverse(int n, int s){
        if(n == 0){
            return s;
        }
        int r = n % 10;
        s = (s*10) + r;
        return reverse(n/10,s);
    }
}
