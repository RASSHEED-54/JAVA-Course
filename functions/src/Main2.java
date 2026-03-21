import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        calci();
    }
    static void calci(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Operation: ");
        System.out.println("---------------------");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("--------------------");

        System.out.println();

        String opr = in.next();

        System.out.print("ENTER num1: ");
        int num1 = in.nextInt();

        System.out.print("ENTER num2: ");
        int num2 = in.nextInt();

        switch(opr){
            case("1"):{
                int ans = num1 + num2;
                System.out.println("ANSWER: " + ans);
                break;
            }
            case("2"):{
                int ans = num1 - num2;
                System.out.println("ANSWER: "+ ans);
                break;
            }
            case("3"):{
                int ans = num1 * num2;
                System.out.println("AMSWER: "+ ans);
                break;
            }
            case("4"):{
                int ans = num1 / num2;
                System.out.println("ANSWER: "+ ans);
            }
            default:{
                System.out.println("CHECK YOUR OPERATOR !!");
                System.out.println("---ENTER CORRECT OPERATOR--");
                break;
            }
        }
        System.out.println("\t##### THANK-YOU #####");
    }
}