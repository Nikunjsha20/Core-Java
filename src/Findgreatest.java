import java.util.Scanner;

public class Findgreatest {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three Number to find Greatest Number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        greatest(num1,num2,num3);
    }
    static void greatest(int n1, int n2, int n3){
        if (n1>n2) {
            if (n1 > n3) {
                System.out.println(n1);
            } else {
                System.out.println(n3);
            }
            }
        else{
                if (n2 > n3) {
                    System.out.println(n2);
                } else {
                    System.out.println(n3);
                }
            }
    }
}
