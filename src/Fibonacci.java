public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacciLoop(9));
        System.out.println(fibonacciRecursive(9));
    }

    public static int fibonacciLoop(int num){
        int numX = 0;
        int numY = 1;
        int output = 0;

        for(int i=0; i<num; i++){
            System.out.print(output+ " ");
            numX = numY;
            numY = output;
            output = numX + numY;
        }

        return output;
    }

    //🤯🤯🤯🤯🤯🤯🤯🤯🤯🤯🤯🤯🤯🤯🤯🤯
    public static int fibonacciRecursive(int n){
        if(n <= 1){
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}
