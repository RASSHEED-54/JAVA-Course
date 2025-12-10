import java.util.*;
public class withReturn {
    public static String printName(String name){
        return("Hello "+name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Whats Your Name : ");
        String name = sc.nextLine();

        System.out.println(printName(name));
        sc.close();
    }
}
