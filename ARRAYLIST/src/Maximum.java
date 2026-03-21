public class Maximum {
    public static void main(String[] args) {
        int[] arr = {12,5,78,23,44};

        System.out.println("MAXIMUM: "+max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
