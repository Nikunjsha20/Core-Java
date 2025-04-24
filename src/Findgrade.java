import java.util.Scanner;

public class Findgrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Your Percentage to find Grade: ");

        float percentage = scanner.nextFloat();
        grade(percentage);

        scanner.close();
    }
    static void grade(float per){
        if (per>=85 && per<=100){
            System.out.println("A");
        }
        else if (per>=70 && per<85){
            System.out.println("B");
        }
        else if (per>=55 && per<70){
            System.out.println("C");
        }
        else if (per>=40 && per<55){
            System.out.println("D");
        }
        else if (per>=0 && per<40){
            System.out.println("E");
        }
        else{
            System.out.println("Invalid Number format..!! Try Again..!!");
        }
    }

}
