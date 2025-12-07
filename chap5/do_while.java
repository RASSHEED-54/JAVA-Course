import java.util.*;

public class do_while {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n,i = 0;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        do{
            System.out.print(i+" ");
            i++;
        }while(i<n);

        sc.close();
    }
}