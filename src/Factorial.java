public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialForLoop(5));
        System.out.println(factorial(5));
    }

    public static int factorialForLoop(int num) {
        int output = 1;

        for (int i = 1; i <= num; i++) {
            output *= i;
        }
        return output;
    }

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }
}
