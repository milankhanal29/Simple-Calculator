package calculator;
import java.util.*;

public class Calculate {
    public static int Add(int a, int b)
    {
        return a+b;
    }
     public static int Subtract(int a, int b)
    {
        return a-b;
    }
     public static int Multiply(int a, int b)
    {
        return a*b;
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

        if ("+".equals(oper)) {
            result = Add(a, b);
        } else if ("-".equals(oper)) {
            result = Subtract(a, b);
        } else if ("*".equals(oper)) {
            result = Multiply(a, b);
        } else if ("/".equals(oper)) {
            result = Divide(a, b);
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);
    
    }
    
}
