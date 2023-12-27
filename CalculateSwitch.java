package calculator;

import java.util.Scanner;

public class CalculateSwitch {
    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Subtract(int a, int b) {
        return a - b;
    }

    public static int Multiply(int a, int b) {
        return a * b;
    }

    public static double Divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1");
        int a = sc.nextInt();
        System.out.println("Enter operator [+,-,/,*]");
        String oper = sc.next();
        System.out.println("Enter num 2");
        int b = sc.nextInt();

        double result;

        switch (oper.charAt(0)) {
            case '+':
                result = Add(a, b);
                break;
            case '-':
                result = Subtract(a, b);
                break;
            case '*':
                result = Multiply(a, b);
                break;
            case '/':
                result = Divide(a, b);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
