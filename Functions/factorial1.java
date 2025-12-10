import java.util.*;
public class factorial1 {
    // No Argument and No Return
    public static void fact(){
        int f=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            f=f*i;
        }

        System.out.print(n+" ! "+" = "+f);

        sc.close();
    }
    public static void main(String[] args) {
        fact();
    }
}
