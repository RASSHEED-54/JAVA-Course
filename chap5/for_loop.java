import java.util.*;
public class chapter{
    
    public static void main(String[] args) {
        // loops
        //Tables
        Scanner sc = new Scanner(System.in);
        int n,h;
        System.out.print("Enter Which Table : ");
        n = sc.nextInt();
        System.out.print("Enter how many times : ");
        h = sc.nextInt();
        for(int i=1; i<=h; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }

        sc.close();
    }
}