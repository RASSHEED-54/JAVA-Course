import java.util.Scanner;
public class whileloop {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter n: ");
    n = sc.nextInt();
    
    int i=0;
    while(i<n){
        System.out.println(i);
        i++;
    }

    sc.close();
  }  
}
