import java.util.Scanner;
public class factorial3 {
    // Argument NO Return
    public static void fact(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f=f*i;
        }
        System.out.println("Factorial :"+ f);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter n :");
        n = sc.nextInt();
        fact(n);

        sc.close();
    }
}
