import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = scanner.nextLine();

        System.out.print("Enter the Character to Search : ");
        char ch = scanner.nextLine().charAt(0);

        System.out.println(search(str.toCharArray(),ch));
    }

    static boolean search(char[] name, char ch){
        for(char character : name){
            if(character == ch){
                return true;
            }
        }
        return false;
    }
}
