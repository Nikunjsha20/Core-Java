import java.util.Scanner;

public class ComparisonOperator {
    public static void main(String[] args){
        //>, < , >=, <=, ==, != Comparison/Relational Operators...!!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number for comparison to other");
        int n1 = scanner.nextInt();
        System.out.println("Enter Second number for comparison to other");
        int n2 = scanner.nextInt();

        if (n1<n2) {
            System.out.println("n1 is smaller than n2..!");
        }
        else if (n1==n2){
            System.out.println("n1 is equal to n2..!");
        }
        else{
            System.out.println("n1 is greater than n2..!!");
        }

        scanner.close();
    }

}
