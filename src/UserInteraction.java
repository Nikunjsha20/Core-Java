import java.util.Scanner;
public class UserInteraction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Integer Number: ");
        int num = scanner.nextInt();
        System.out.println(num);

        System.out.println("Enter a string Without Spacing: ");
        String First_name = scanner.next();
        System.out.println(First_name);
        scanner.nextLine(); // it is used because nextLine() take a space if we enter so ignore that space and take needed correct value.
        System.out.println("Enter a string with Spacing: ");
        String Full_name = scanner.nextLine();
        System.out.println(Full_name);

        System.out.println("Enter a Float number: ");
        float num2 = scanner.nextFloat();
        System.out.println(num2);

        scanner.close();

    }
}
