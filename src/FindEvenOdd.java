import java.util.Scanner;
public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check even or odd: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is Even..!!");
        }
        else {
            System.out.println("Number is Odd...!!");
        }
        scanner.close();
    }

}
