import java.util.Scanner;

public class Calculator {

    static double addition(double a, double b){
        return (a+b);

    }
    public static void main(String[] args) {
        System.out.println("Select a operation");
        System.out.println("1. Addition");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the first operand");
        int op1= sc.nextInt();
        System.out.println("Enter the Second operand");
        int op2 = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("The sum of "+op1+" and "+op2+" is"+addition(op1,op2));
        }
    }
}
