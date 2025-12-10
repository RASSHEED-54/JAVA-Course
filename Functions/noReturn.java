import java.util.*;
public class noReturn{
    
    public static void calculateSum(int x,int y) {
        int sum = x + y;
        System.out.println("Sum : "+sum);
    }
    
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a :");
        a = sc.nextInt();
        System.out.print("Enter b :");
        b = sc.nextInt();

        calculateSum(a,b);

        sc.close();
    }
}