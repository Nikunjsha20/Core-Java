import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args){
        // && , ||, !

        // Logical operator &&(AND)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter true if your have voterId otherwise false: ");
        boolean hasVoterID = scanner.nextBoolean();

        if (age>=18 && hasVoterID){
            System.out.println("Eligible to vote:");
        }
        else{
            System.out.println("Not eligible to vote");
        }

        // Logical operator ||(OR)
        System.out.println("Have you Passport(true/false):");
        boolean passport = scanner.nextBoolean();
        System.out.println("Have you Driving license(true/false):");
        boolean DrivingLicense = scanner.nextBoolean();

        if (passport || DrivingLicense){
            System.out.println("You have Valid Id Proof..!!");
        }
        else{
            System.out.println("You do not have Valid Id Proof..!!");
        }

        // Logical operator !(Not)
        System.out.println("Are you Student(true/false)");
        boolean isStudent = scanner.nextBoolean();

        if (!isStudent){
            System.out.println("You are not Student..!!");
        }
        else{
            System.out.println("You are a Student...!!");
        }


    }
}
