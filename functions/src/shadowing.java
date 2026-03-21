public class shadowing{
    static int x = 54;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x = 30; // Shadow the universal variable declaration
        func(x);
        System.out.println(x);
    }
    static void func(int x){
        System.out.println(x);
    }
}