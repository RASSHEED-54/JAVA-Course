import java.util.Scanner;

public class chapter4{
    public static void main(String[] args){
        //Calculator
        Scanner sc = new Scanner(System.in);
        char operator;
        int a,b;
        System.out.println("\t========CALCULATOR========");
        System.out.print("\tEnter a : ");
        a = sc.nextInt();   
        System.out.print("\tEnter b : ");
        b = sc.nextInt();
        System.out.print("\tEnter the Operator(+ - * /) : ");
        operator =sc.next().charAt(0);
        System.out.println("###\t\tSOLUTION\t\t###");
        System.out.println();
        System.out.println("-----------------------------------");
        if(operator == '+'){
            System.out.println("Addtion : "+ (a+b));
        }
        else if(operator == '-'){
            System.out.println("Subtraction : "+(a - b));
        }
        else if(operator == '*'){
            System.out.println("Multiplication : "+(a*b));
        }
        else if(operator == '/'){
            System.out.println("Division : "+(a/b));
        }
        else{
            System.out.println("Invalid Operator...Try again !");
        }
        System.out.println("-----------------------------------");
        sc.close();
    }
}