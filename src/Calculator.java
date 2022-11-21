import java.util.Scanner;

public class Calculator {

    static double addition(double a, double b){
        return (a+b);
    }
    static double subtraction(double a, double b){
        return (a-b);
    }
    static double multiplication(double a, double b){
        return (a*b);
    }

    static double division(double a, double b){
        return (a/b);
    }



    public static void main(String[] args) {
        int x=0;
        while(x==0){
        System.out.println("Select a operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");



        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            System.out.println("Enter the first operand");
            int op1 = sc.nextInt();
            System.out.println("Enter the Second operand");
            int op2 = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println(op1 + " + " + op2 + " = " + addition(op1, op2));
                break;
            case 2:
                System.out.println(op1 + " - " + op2 + " = " + subtraction(op1, op2));
                break;
            case 3:
                System.out.println(op1 + " * " + op2 + " = " + multiplication(op1, op2));
                break;
            case 4:
                System.out.println(op1 + " / " + op2 + " = " + division(op1, op2));
                break;
            case 5:
                System.out.println("Thanks for using");
                x = 1;
                break;
            default:
                System.out.println("Invalid Choice");
        }



        }
    }
}
