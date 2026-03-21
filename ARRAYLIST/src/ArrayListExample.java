import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Numbers:");
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
