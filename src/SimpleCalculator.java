import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = scanner.nextInt();


        addition(num1,num2);
        substraction(num1, num2);
        multiplication(num1, num2);
        division(num1, num2);
        remainder(num1, num2);
    }
    static void addition(int n1, int n2){
        System.out.println("sum: "+(n1+n2));
    }
    static void substraction(int n1, int n2){
        System.out.println("sub: "+ (n1-n2));
    }
    static void multiplication(int n1, int n2){
        System.out.println("multi: "+ (n1*n2));
    }
    static void division(int n1, int n2){
        if (n2==0){
            System.out.println("Invalid Divisor!! Cannot divide by zero!");
        }
        else {
            System.out.println("div: " + (n1 / n2));
        }
    }
    static void remainder(int n1, int n2){
        if (n2==0){
            System.out.println("Invalid Divisor!! Cannot divide by zero!");
        }
        else {
            System.out.println("rem: " + (n1 % n2));
        }
    }

}
