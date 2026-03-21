import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        for(int i=1; i<100000000; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n){
        int original_n = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return original_n == sum;
    }
}
