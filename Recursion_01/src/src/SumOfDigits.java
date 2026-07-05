public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits(123,0);
        System.out.println(ans);
    }
    static int  sumOfDigits(int n,int s){
        if(n==0){
            return 0;
        }
        while(n > 0){
            int r = n % 10;
             s = s + r;
            n = n / 10;
        }
        return s + sumOfDigits(n,s);
    }


}
