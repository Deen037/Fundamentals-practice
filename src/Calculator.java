import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        Integer inputOne = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        Integer inputTwo = scanner.nextInt();
        System.out.print("Enter action ( + - * /) : ");
        String action = scanner.next();

        int result = 0;

        switch (action) {
            case "+" -> result = inputOne + inputTwo;
            case "-" -> result = inputOne - inputTwo;
            case "*" -> result = inputOne * inputTwo;
            case "/" -> {
                if (inputTwo == 0) {
                    System.out.println("Can't divide by zero");
                } else {
                    result = inputOne / inputTwo;
                }
            }
        }
        System.out.println(inputOne + " " + action + " " + inputTwo + " = " + result);
    }
}
