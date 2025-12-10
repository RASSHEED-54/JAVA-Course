import java.util.*;
public class factorial2 {
    //No Argument but return a value 
    public static int fact(){
        int f=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        for(int i=1 ; i<=n; i++){
            f=f*i;
        }
        return(f);        
        
    }
    public static void main(String[] args) {
        int y = fact();
        System.out.print("Factorial :"+y);   
    }
}
