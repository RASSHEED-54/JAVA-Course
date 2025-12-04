import java.util.*;
public class chapter3{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum : "+sum);
        sc.close();
    }
}
