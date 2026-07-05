
public class Palindrome {
    public static void main(String[] args) {
        int ans = isPalindrome(123,0);
        int a = 123;
        System.out.println(ans == a);
    }
    static int isPalindrome(int n, int s){
        if(n == 0){
            return s;
        }
        int r = n % 10;
        s = (s*10) + r;
        return isPalindrome(n/10,s);
    }
}
