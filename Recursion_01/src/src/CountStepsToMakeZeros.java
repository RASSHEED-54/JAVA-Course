public class CountStepsToMakeZeros {
    public static void main(String[] args) {
        int steps = countSteps(41,0);
        System.out.println(steps);
    }
    static int countSteps(int n, int steps){
        if(n == 0){
            return steps;
        }
        if(n % 2 == 0){
            n = n / 2;
            steps++;
        }
        if(n % 2 == 1){
            n = n - 1;
            steps++;
        }
        return countSteps(n,steps);

    }
}
