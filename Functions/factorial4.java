import java.util.*;
public class factorial4 {
    // Argument and Return a Value
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f=f*i;
        }

        return(f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,y;

        System.out.print("Entre n :");
        n=sc.nextInt();

        y=fact(n);
        System.out.print("Factorial :"+y);

        sc.close();
    }
}
