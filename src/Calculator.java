import java.util.Scanner;

public class Calculator {

    static double addition(double a, double b){
        return (a+b);
    }
    static double subtraction(double a, double b){
        return (a-b);
    }

    public static void main(String[] args) {
        System.out.println("Select a operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the first operand");
        int op1= sc.nextInt();
        System.out.println("Enter the Second operand");
        int op2 = sc.nextInt();
        switch (n){
            case 1:
                System.out.println(op1+" + "+op2+" = "+addition(op1,op2));
            case 2:
                System.out.println(op1+" - "+op2+" = "+subtraction(op1,op2));

        }
    }
}
