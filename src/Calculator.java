import java.util.Scanner;


public class Calculator {
    public static void main(String[] args){
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number = ");
        /*
        we are goona use data type double so that
        *user can enter int as well as floating point
        * value

        */
        num1 = scanner.nextDouble();
        System.out.print("Enter second Numbers = ");
        num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            default:
                System.out.print("you have entered wrong format");
                return;

        }

        System.out.println(num1+" "+operator+" "+num2+" = "+output);
    }

}
