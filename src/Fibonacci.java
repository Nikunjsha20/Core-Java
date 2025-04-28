import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int n1 = 0, n2= 1;
        System.out.println("Enter the number of times repetition is required: ");
        Scanner scanner = new Scanner(System.in);
        int  num = scanner.nextInt();
        for (int i = 1; i<=num; i++){
            System.out.print(n1 + " ");
            int temp = n1+n2;
            n1 = n2;
            n2 = temp;
        }
        scanner.close();
    }
}
