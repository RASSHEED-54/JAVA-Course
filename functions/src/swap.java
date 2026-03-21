public class swap{

    // PASS BY VALUE

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapping(a,b);
        System.out.println("INSIDE MAIN FUNCTION:");
        System.out.print("a = "+a+" "+"b = "+b);
    }
    static void swapping(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("INSIDE SWAP FUNCTION:");
        System.out.print("a = "+a+" "+"b = "+b);
        System.out.println();
    }
}