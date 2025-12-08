public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            int k=i;
            int m=2;            
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(k--);
            }
            for(int j=1; j<=i-1; j++){
                if(i==1){
                    System.out.print(" ");
                }
                System.out.print(m++);
            }            
            System.out.println();
        }
    }
 }
//                Palindromic Pyramid
//     1
//    212
//   32123
//  4321234
// 543212345