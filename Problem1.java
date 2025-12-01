import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
           double a = sc.nextDouble();
        
         System.out.print("Enter second number (b): ");
            double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
           String op = sc.next();

          double result = 0;

        switch(op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": 
                if(b != 0) result = a / b;
                else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
