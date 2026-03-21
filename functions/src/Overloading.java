import java.util.Scanner;
public class Overloading {
    public static void main(String[] args) {

        int a,b,c;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter No Of Inputs: ");
        int n = in.nextInt();

        if( n==2 ){
            a = in.nextInt();
            b = in.nextInt();
            System.out.println("Answer: "+sum(a,b));
        }
        else {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            System.out.println("Answer: "+sum(a,b,c));
        }
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
